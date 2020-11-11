package base;

import java.util.ArrayList;

class FigureController {
    static Figure getFigureWithBiggestArea(ArrayList<Figure> figures){
        Figure res = figures.get(0);

        for(Figure fig: figures)
            res = fig.getArea() > res.getArea() ? fig : res;

        return res;
    }

    static Figure getFigureWithBiggestPerimeter(ArrayList<Figure> figures){
        Figure res = figures.get(0);

        for(Figure fig: figures)
            res = fig.getPerimeter() > res.getPerimeter() ? fig : res;

        return res;
    }
}
