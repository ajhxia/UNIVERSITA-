
import javax.swing.*;
import Pokemon.CreateObjectsPokemon;
import Pokemon.Pokemon;
import Shared.ImageUtility;
import Shared.PixelFont;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/*
 * Questa classe rappresenta il pokedex del gioco
 * Il pokedex contiene le immagini dei Pokémon
 * Cliccando su un'immagine si aprirà una finestra con le informazioni del Pokémon
 */

public class Pokedex extends JPanel implements ActionListener {
    private static Pokemon[] pokemonArray = new Pokemon[42];
    private static ImageIcon[] pokemonImages = new ImageIcon[42]; // Array per 42 Pokémon
    private static JFrame infoFrame;
    private static JFrame pokedexFrame;
    public static JLabel titleLabel;

    public Pokedex() {
        pokedexFrame = new JFrame("Pokédex of " + Player.player.getName());
        pokedexFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pokedexFrame.setSize(900, 700);

        // Utilizzo BorderLayout per il pannello principale
        this.setLayout(new BorderLayout());

        // Creo un pannello per i bottoni dei Pokémon
        JPanel pokemonPanel = new JPanel(new GridLayout(0, 6));

        // Aggiungo i bottoni con le immagini dei Pokémon al pannello pokemonPanel
        for (int i = 0; i < pokemonArray.length; i++) {
            JButton button = new JButton();
            button.setIcon(pokemonImages[i]);
            button.setActionCommand(String.valueOf(i + 1));
            button.addActionListener(this);
            button.setBorder(null);
            button.setContentAreaFilled(false);
            button.setToolTipText(pokemonArray[i].getName());
            button.setCursor(new Cursor(Cursor.HAND_CURSOR));
            pokemonPanel.add(button);
        }

        // Aggiungo il pannello pokemonPanel nella parte centrale del layout
        this.add(pokemonPanel, BorderLayout.CENTER);

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        topPanel.setPreferredSize(new Dimension(900, 50)); // Imposta le dimensioni preferite del pannello
        
        // Aggiungo il titolo al pannello
        titleLabel = new JLabel("Pokémon in Team: " + Player.player.getTeam().getPlayerTeam().size());
        titleLabel.setFont(PixelFont.myCustomFont);
        topPanel.add(titleLabel);
        
        // Aggiungo il bottone "Conferma" al pannello
        JButton confirm = new JButton("Confirm");
        confirm.setActionCommand("confirm");
        confirm.addActionListener(e -> {
            if (Player.player.getTeam().getPlayerTeam().size() == 6) {
                InfoRecap infoRecap = new InfoRecap(Player.player);
                infoRecap.setVisible(true);
                pokedexFrame.dispose();
            }else{
                JOptionPane.showMessageDialog(pokedexFrame, "You must have 6 Pokémon in the team to continue.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        confirm.setCursor(new Cursor(Cursor.HAND_CURSOR));
        confirm.setFont(PixelFont.myCustomFont);
        confirm.setMargin(new Insets(10, 20, 10, 20)); // Imposta il padding (top, left, bottom, right)
        confirm.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(10, 20, 10, 20) // Imposta il padding all'interno del bordo
        ));
        confirm.setContentAreaFilled(false); // Rimuove il colore di sfondo
        topPanel.add(confirm);
        
        // Aggiungo il pannello dei titoli e del bottone "Conferma" al frame
        pokedexFrame.add(topPanel, BorderLayout.NORTH);

        pokedexFrame.add(this);
        pokedexFrame.setVisible(true);
        pokedexFrame.setLocationRelativeTo(null);
    }

    // Carica le immagini dei Pokémon in un array
    public static void loadImagesPokemon() {
        // il try-catch serve per gestire le eccezioni che possono essere lanciate
        // durante il caricamento delle immagini
        // in particolare, il metodo loadImage lancia un'eccezione se non riesce a
        // caricare l'immagine
        try {
            for (int i = 0; i < 42; i++) {
                String sprites = pokemonArray[i].getSprite().getFront();
                if (sprites != null) {
                    pokemonImages[i] = ImageUtility.loadImage(new URI(sprites));
                }
            }
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    // carico i Pokémon in un array
    public static void loadPokemon() {
        for (int i = 0; i < 42; i++) {
            pokemonArray[i] = CreateObjectsPokemon.getPokemon(i + 1);
        }
        loadImagesPokemon();
    }

    // Metodo chiamato quando si clicca su un bottone
    @Override
    public void actionPerformed(ActionEvent e) {
        int pokeIndex = Integer.parseInt(e.getActionCommand());
        try {
            showPokemonInfo(pokeIndex);
        } catch (IOException | URISyntaxException e1) {
            e1.printStackTrace();
        }
    }

    // Mostra le informazioni di un Pokémon in una finestra separata di tipo
    // InfoPokemon
    private void showPokemonInfo(int pokeIndexIn) throws IOException, URISyntaxException {
        if (infoFrame != null) {
            infoFrame.dispose(); // Chiudi il JFrame precedente se esiste
        }
        InfoPokemon infoPokemon = new InfoPokemon(pokemonArray[pokeIndexIn - 1], Player.player);
        infoFrame = new JFrame(pokemonArray[pokeIndexIn - 1].getName() + " Info");
        infoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        infoFrame.setSize(520, 400);
        infoFrame.setLocationRelativeTo(null); // Centra la finestra nello schermo
        infoFrame.add(infoPokemon);
        infoFrame.setVisible(true);
    }

    // Restituisce il Pokémon all'indice specificato
    public static Pokemon getPokemon(int index) {
        return pokemonArray[index - 1];
    }

    public static void updateTitle() {
        // Ottieni il numero corrente di Pokémon nella squadra e aggiorna il testo del titolo
        int numPokemon = Player.player.getTeam().getPlayerTeam().size();
        titleLabel.setText("Pokémon in Team: " + numPokemon);
    }

}
