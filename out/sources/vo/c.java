package vo;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f207667a = null;

    private boolean a(File file) {
        String lowerCase = file.getName().toLowerCase(Locale.US);
        return (lowerCase.endsWith(".ttf") || lowerCase.endsWith(".otf") || lowerCase.endsWith(".pfb") || lowerCase.endsWith(".ttc")) && !lowerCase.startsWith("fonts.");
    }

    private b b() {
        if (System.getProperty("java.vendor").equals("The Android Project")) {
            return new a();
        }
        String property = System.getProperty("os.name");
        if (property.startsWith("Windows")) {
            return new h();
        }
        if (property.startsWith("Mac")) {
            return new d();
        }
        return property.startsWith("OS/400") ? new f() : new g();
    }

    private void d(File file, List<URI> list) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (!file2.isDirectory()) {
                    if (yo.a.b()) {
                        file2.toString();
                    }
                    if (a(file2)) {
                        if (yo.a.b()) {
                            file2.toString();
                        }
                        list.add(file2.toURI());
                    }
                } else if (!file2.getName().startsWith(".")) {
                    d(file2, list);
                }
            }
        }
    }

    public List<URI> c() {
        if (this.f207667a == null) {
            this.f207667a = b();
        }
        List<File> listA = this.f207667a.a();
        ArrayList arrayList = new ArrayList();
        Iterator<File> it = listA.iterator();
        while (it.hasNext()) {
            d(it.next(), arrayList);
        }
        return arrayList;
    }
}
