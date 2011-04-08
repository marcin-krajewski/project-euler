package pl.krajewski.euler.problems.implementations.problems200_210;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;

public class Problem210 extends Problem<Double> {

    private Integer radiusIndex = 0;

    @Override
    public Double resolveProblem() {
        
        double radius = getParameterForNumber(radiusIndex);
        
        double result = 0;
        
        double rdiv2 = radius/2;
        double rdiv4 = radius/4;
        double rdiv8 = radius/8;
        double rpow2div64 = radius*radius/32;
        
        double c;
        double d;
        double e;
        double f;
        double g;
        double h;
        
        for(double x = -rdiv2; x <= rdiv2; x++) {
            double x2 = 2*x;
            d = -x+rdiv2;
            e = d+x2;
            f = e-radius;
            g = f-x2;
            h = x-rdiv8;
            for(double y = -rdiv2; y <= rdiv2; y++) {
                if(y<=d) {
                    if(y < e && y >= f) {
                        if(y>-x) {
                            result++;
                        }
                        if(y!=d && y>=g) {
                            result++;
                        }
                    }
//                    if(y < d && y < e && y >= f && y >= g) {
//                        result++;
//                    }
//                    if(y <= d && y < e && y >= f && y > -x) {
//                        result++;
//                    }
                }
                double i = y-rdiv8;
                if(y < x && h*h + i*i < rpow2div64) {
                    result++;
                }
            }
        }
        
//        for(double x = -rdiv2; x <= rdiv2; x++) {
//            for(double y = -rdiv2; y <= rdiv2; y++) {
//                
//            }
//        }
//        
//        for(double x = -rdiv4; x <= rdiv4; x++) {
//            for(double y = -rdiv4; y <= rdiv4; y++) {
//                
//            }
//        }
        
        
        
//        for(double x = -radius; x <= radius; x++) {
//            for(double y = -radius; y <= radius; y++) {
//        
//                if(x >= y) {
//                    continue;
//                }
//                
//                c = Math.abs(x) + Math.abs(y);
//                if(c > radius) {
//                    continue;
//                }
//                
//                if(y < -x || y > -x + rdiv2) {
//                    result++;
//                }
//                else if( (x-rdiv8)*(x-rdiv8) + (y-rdiv8)*(y-rdiv8) < rpow2div64) {
//                    result++;
//                }
//            }
//        }
        
        return result*2;
    }

    @Override
    public Double getCorrectProblemAnswer() {
        // TODO Auto-generated method stub
        return 100.0;
    }

    @Override
    protected Parameters getParametersForProblem() {
        return new Parameters(8.0);
    }

}
