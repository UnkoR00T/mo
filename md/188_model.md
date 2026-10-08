# Paczka 188 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `s5/l.java (część 3/3)`

## s5/l.java (część 3/3)

```java
package s5;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class l {

    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static Bitmap b(Context context, Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(r5.c.f171800b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(r5.c.f171799a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
    }

    public static class e {
        boolean A;
        boolean B;
        boolean C;
        String D;
        Bundle E;
        int F;
        int G;
        Notification H;
        RemoteViews I;
        RemoteViews J;
        RemoteViews K;
        String L;
        int M;
        String N;
        long O;
        int P;
        int Q;
        boolean R;
        Notification S;
        boolean T;
        Object U;

        @Deprecated
        public ArrayList<String> V;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f177909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<a> f177910b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<s> f177911c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ArrayList<a> f177912d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        CharSequence f177913e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        CharSequence f177914f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        String f177915g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PendingIntent f177916h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        PendingIntent f177917i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        RemoteViews f177918j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        IconCompat f177919k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        CharSequence f177920l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f177921m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f177922n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f177923o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f177924p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        g f177925q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        CharSequence f177926r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        CharSequence f177927s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        CharSequence[] f177928t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f177929u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f177930v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        boolean f177931w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        String f177932x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        boolean f177933y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        String f177934z;

        static class a {
            static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i15) {
                return builder.setContentType(i15);
            }

            static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i15) {
                return builder.setUsage(i15);
            }
        }

        public e(Context context, String str) {
            this.f177910b = new ArrayList<>();
            this.f177911c = new ArrayList<>();
            this.f177912d = new ArrayList<>();
            this.f177923o = true;
            this.A = false;
            this.F = 0;
            this.G = 0;
            this.M = 0;
            this.P = 0;
            this.Q = 0;
            Notification notification = new Notification();
            this.S = notification;
            this.f177909a = context;
            this.L = str;
            notification.when = System.currentTimeMillis();
            this.S.audioStreamType = -1;
            this.f177922n = 0;
            this.V = new ArrayList<>();
            this.R = true;
        }

        protected static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void m(int i15, boolean z15) {
            if (z15) {
                Notification notification = this.S;
                notification.flags = i15 | notification.flags;
            } else {
                Notification notification2 = this.S;
                notification2.flags = (~i15) & notification2.flags;
            }
        }

        public e a(int i15, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f177910b.add(new a(i15, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new m(this).c();
        }

        public Bundle c() {
            if (this.E == null) {
                this.E = new Bundle();
            }
            return this.E;
        }

        public e e(boolean z15) {
            m(16, z15);
            return this;
        }

        public e f(String str) {
            this.L = str;
            return this;
        }

        public e g(int i15) {
            this.F = i15;
            return this;
        }

        public e h(PendingIntent pendingIntent) {
            this.f177916h = pendingIntent;
            return this;
        }

        public e i(CharSequence charSequence) {
            this.f177914f = d(charSequence);
            return this;
        }

        public e j(CharSequence charSequence) {
            this.f177913e = d(charSequence);
            return this;
        }

        public e k(int i15) {
            Notification notification = this.S;
            notification.defaults = i15;
            if ((i15 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e l(PendingIntent pendingIntent) {
            this.S.deleteIntent = pendingIntent;
            return this;
        }

        public e n(Bitmap bitmap) {
            this.f177919k = bitmap == null ? null : IconCompat.b(l.b(this.f177909a, bitmap));
            return this;
        }

        public e o(int i15, int i16, int i17) {
            Notification notification = this.S;
            notification.ledARGB = i15;
            notification.ledOnMS = i16;
            notification.ledOffMS = i17;
            notification.flags = ((i16 == 0 || i17 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e p(boolean z15) {
            this.A = z15;
            return this;
        }

        public e q(int i15) {
            this.f177921m = i15;
            return this;
        }

        public e r(int i15) {
            this.f177922n = i15;
            return this;
        }

        public e s(boolean z15) {
            this.f177923o = z15;
            return this;
        }

        public e t(int i15) {
            this.S.icon = i15;
            return this;
        }

        public e u(Uri uri) {
            Notification notification = this.S;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder builderD = a.d(a.c(a.b(), 4), 5);
            this.S.audioAttributes = a.a(builderD);
            return this;
        }

        public e v(g gVar) {
            if (this.f177925q != gVar) {
                this.f177925q = gVar;
                if (gVar != null) {
                    gVar.g(this);
                }
            }
            return this;
        }

        public e w(CharSequence charSequence) {
            this.S.tickerText = d(charSequence);
            return this;
        }

        public e x(long[] jArr) {
            this.S.vibrate = jArr;
            return this;
        }

        public e y(int i15) {
            this.G = i15;
            return this;
        }

        public e z(long j15) {
            this.S.when = j15;
            return this;
        }

        @Deprecated
        public e(Context context) {
            this(context, null);
        }
    }
}
```
