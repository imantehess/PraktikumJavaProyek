import helpers.Koneksi;
import frame.KabupatenViewFrame;
import frame.KecamatanViewFrame;

public class Main {
    public static void main(String[] args) {
//        Koneksi.getConnection();
//        KabupatenViewFrame viewFrame = new KabupatenViewFrame();
        KecamatanViewFrame viewFrame = new KecamatanViewFrame();
        viewFrame.setVisible(true);
    }

}
