// "Assert 'container != null'" "true"
class A{
  void test(){
    Object container = null;
    Runnable r = () -> {
        if (container == null) {
            assert container != null;
            container.toString();
        } else {
            "";
        }
    };
  }
}