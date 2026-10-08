package j6;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f99757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f99758b;

    public x(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f99757a | this.f99758b;
    }

    public void b(View view, View view2, int i15) {
        c(view, view2, i15, 0);
    }

    public void c(View view, View view2, int i15, int i16) {
        if (i16 == 1) {
            this.f99758b = i15;
        } else {
            this.f99757a = i15;
        }
    }

    public void d(View view, int i15) {
        if (i15 == 1) {
            this.f99758b = 0;
        } else {
            this.f99757a = 0;
        }
    }
}
