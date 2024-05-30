package Battle;
import java.awt.Color;
import java.io.IOException;

import javax.swing.*;

import Game.Coach;
import Shared.PixelFont;
import Shared.Style;

public class ChangePokemonFrame extends JFrame {
    public ChangePokemonFrame(BattleFrame battleFrame) {
        Coach player = BattleLogic.getPlayer();
        Coach npc = BattleLogic.getNpc();

        setTitle("Change Pokemon");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(battleFrame);
        setLayout(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 400, 350);
        add(panel);

        JLabel label = new JLabel("Select a Pokémon to change");
        label.setFont(PixelFont.myCustomFont.deriveFont(11f));
        label.setBounds(50, 10, 300, 30);
        panel.add(label);

        for (int i = 0; i < player.getTeam().getListPokemon().size(); i++) {
            final int index = i;
            JButton button = Style.createButton(Color.BLACK, player.getTeam().getPokemon(index).getName(), 14 ,100, 60 + (index * 40), 200, 30);
            button.addActionListener(e -> {
                if (player.getTeam().getPokemon(index).getStats().getHp() > 0) {
                    player.setPokemonInUse(player.getTeam().getPokemon(index));
                }else{
                    JOptionPane.showMessageDialog(null, "You can't change a fainted Pokémon", "Error", JOptionPane.ERROR_MESSAGE);
                }
                dispose();
                try {
                    battleFrame.updatePokemonDisplayPlayer(player, npc);
                    BattleLogic.setTurn(false);
                    BattleLogic.npcLogic();
                    System.out.println(player.getPokemonInUse().getName());
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            });
            panel.add(button);
        }

        setVisible(true);
    }
}

