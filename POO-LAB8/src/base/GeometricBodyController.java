package base;

import java.util.ArrayList;

class GeometricBodyController {
    static GeometricBody getFigureWithBiggestSurface(ArrayList<GeometricBody> geometricBodies){
        GeometricBody res = geometricBodies.get(0);

        for(GeometricBody fig: geometricBodies)
            res = fig.getSurface() > res.getSurface() ? fig : res;

        return res;
    }

    static GeometricBody getFigureWithBiggestVolume(ArrayList<GeometricBody> geometricBodies){
        GeometricBody res = geometricBodies.get(0);

        for(GeometricBody fig: geometricBodies)
            res = fig.getVolume() > res.getVolume() ? fig : res;

        return res;
    }
}
