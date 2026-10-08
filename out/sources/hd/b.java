package hd;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<u> f83579a = new ArrayList();

    void a(u uVar) {
        this.f83579a.add(uVar);
    }

    public void b(Path path) {
        for (int size = this.f83579a.size() - 1; size >= 0; size--) {
            td.m.b(path, this.f83579a.get(size));
        }
    }
}
