package vo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e implements b {
    @Override // vo.b
    public List<File> a() {
        ArrayList arrayList = new ArrayList();
        String[] strArrB = b();
        if (strArrB != null) {
            for (String str : strArrB) {
                File file = new File(str);
                try {
                    if (file.exists() && file.canRead()) {
                        arrayList.add(file);
                    }
                } catch (SecurityException unused) {
                }
            }
        }
        return arrayList;
    }

    protected abstract String[] b();
}
