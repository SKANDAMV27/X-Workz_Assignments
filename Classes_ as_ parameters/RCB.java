class RCB
 void selectPlayer(Player player) {
        if (player != null) {
            player.play();
        } else {
            System.out.println("No player selected.");
        }
    }
}
