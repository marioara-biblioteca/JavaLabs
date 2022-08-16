package clasa;
//
//public class Car {
//    public class OttoEngine implements Engine{
//        private int fuelCapacity;
//
//        public OttoEngine(int fuelCapacity) {
//            this.fuelCapacity = fuelCapacity;
//        }
//
//        @Override
//        public int getFuelCapacity() {
//            return fuelCapacity;
//        }
//    }
//    public OttoEngine getEngine(){
//        return new OttoEngine(11);
//    }
//}

class Car {
    public Engine getEngine(int fuelCapacity) {
        return new Engine () {
            private int fuelCapacity = 11;

            public int getFuelCapacity() {
                return fuelCapacity;
            }
        };
    }
}