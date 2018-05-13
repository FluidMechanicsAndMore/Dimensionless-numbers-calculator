package numbers;

    public class Reynolds {

        public double calculateReynoldsWithDynamicViscosity(double density, double velocity, double dynamicViscosity, double linearDimension){
            double Re;
            Re = (density*velocity*linearDimension)/dynamicViscosity;

            return Re;
        }

        public double calculateReynoldsWithKinematicViscosity(double velocity, double kinematicViscosity, double linearDimension){
            double Re;
            Re = velocity*linearDimension/kinematicViscosity;

            return Re;
        }

        public double velocityWithDynamicViscosity(double Re, double density, double dynamicViscosity, double linearDimension) {

            return Re*dynamicViscosity/(density*linearDimension);
        }

        public double velocityWithKinematicViscosity(double Re, double kinematicViscosity, double linearDimension){

            return Re * kinematicViscosity / linearDimension;
        }

        public double linearDimensionWithDynamicViscosity( double Re, double density, double velocity, double dynamicViscosity){

            return Re * dynamicViscosity / ( velocity*density);
        }

        public double linearDimensionWithKinematicViscosity(double Re, double velocity, double kinematicViscosity) {

            return Re*kinematicViscosity/velocity;
        }

        public double densityWithDynamicViscosity(double Re, double velocity, double dynamicViscosity, double linearDimension){

            return Re*dynamicViscosity / (velocity*linearDimension);
        }

    }
