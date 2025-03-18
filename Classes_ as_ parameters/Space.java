class Space {
    void mission(Astronaut astronaut) {
        if (astronaut != null) {
            astronaut.explore();
        } else {
            System.out.println("No astronaut for the mission.");
        }
    }
}
