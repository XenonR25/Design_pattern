public class File implements Component{
    private int size;

    public File(int size) {

        this.size = size;
    }


    @Override
    public int comp() {
        return size;
    }

}
