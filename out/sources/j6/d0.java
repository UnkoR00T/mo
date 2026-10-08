package j6;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f99637a;

    private static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ScrollFeedbackProvider f99638a;

        b(View view) {
            this.f99638a = ScrollFeedbackProvider.createProvider(view);
        }

        @Override // j6.d0.d
        public void onScrollLimit(int i15, int i16, int i17, boolean z15) {
            this.f99638a.onScrollLimit(i15, i16, i17, z15);
        }

        @Override // j6.d0.d
        public void onScrollProgress(int i15, int i16, int i17, int i18) {
            this.f99638a.onScrollProgress(i15, i16, i17, i18);
        }
    }

    private static class c implements d {
        private c() {
        }

        @Override // j6.d0.d
        public void onScrollLimit(int i15, int i16, int i17, boolean z15) {
        }

        @Override // j6.d0.d
        public void onScrollProgress(int i15, int i16, int i17, int i18) {
        }
    }

    private interface d {
        void onScrollLimit(int i15, int i16, int i17, boolean z15);

        void onScrollProgress(int i15, int i16, int i17, int i18);
    }

    private d0(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f99637a = new b(view);
        } else {
            this.f99637a = new c();
        }
    }

    public static d0 a(View view) {
        return new d0(view);
    }

    public void b(int i15, int i16, int i17, boolean z15) {
        this.f99637a.onScrollLimit(i15, i16, i17, z15);
    }

    public void c(int i15, int i16, int i17, int i18) {
        this.f99637a.onScrollProgress(i15, i16, i17, i18);
    }
}
