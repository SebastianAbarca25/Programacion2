//Va dentro de la clase Paintbrush
//Se crea el carro con rectangulos
   public void drawCar(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        Polygon rect = new Polygon();
        rect.addPoint(x1,y1);
        rect.addPoint(x2,y2);
        rect.addPoint(x3,y3);
        rect.addPoint(x4,y4);
        g.setColor(Config.COLOR_CAR);
        g.fillPolygon(rect);
    }
    
//Se le agrega la ventana
    public void drawWindow(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        Polygon rect = new Polygon();
        rect.addPoint(x1,y1);
        rect.addPoint(x2,y2);
        rect.addPoint(x3,y3);
        rect.addPoint(x4,y4);
        g.setColor(Color.CYAN);
        g.fillPolygon(rect);
    }

//Se le agregan las ruedas
    public void drawWheel(){
        g.setColor(Color.BLACK);
        g.fillOval(238, 213, 15, 15);
        g.fillOval(265, 213, 15, 15);
    }
