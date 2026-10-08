# Paczka 186 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `s5/l.java (część 1/3)`

## s5/l.java (część 1/3)

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

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Bundle f177881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IconCompat f177882b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final u[] f177883c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final u[] f177884d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f177885e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f177886f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f177887g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f177888h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Deprecated
        public int f177889i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public CharSequence f177890j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public PendingIntent f177891k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f177892l;

        /* JADX INFO: renamed from: s5.l$a$a, reason: collision with other inner class name */
        public static final class C4548a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final IconCompat f177893a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final CharSequence f177894b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final PendingIntent f177895c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f177896d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final Bundle f177897e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private ArrayList<u> f177898f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f177899g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f177900h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f177901i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private boolean f177902j;

            public C4548a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private void b() {
                if (this.f177901i && this.f177895c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public a a() {
                b();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<u> arrayList3 = this.f177898f;
                if (arrayList3 != null) {
                    for (u uVar : arrayList3) {
                        if (uVar.j()) {
                            arrayList.add(uVar);
                        } else {
                            arrayList2.add(uVar);
                        }
                    }
                }
                return new a(this.f177893a, this.f177894b, this.f177895c, this.f177897e, arrayList2.isEmpty() ? null : (u[]) arrayList2.toArray(new u[arrayList2.size()]), arrayList.isEmpty() ? null : (u[]) arrayList.toArray(new u[arrayList.size()]), this.f177896d, this.f177899g, this.f177900h, this.f177901i, this.f177902j);
            }

            private C4548a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, u[] uVarArr, boolean z15, int i15, boolean z16, boolean z17, boolean z18) {
                this.f177896d = true;
                this.f177900h = true;
                this.f177893a = iconCompat;
                this.f177894b = e.d(charSequence);
                this.f177895c = pendingIntent;
                this.f177897e = bundle;
                this.f177898f = uVarArr == null ? null : new ArrayList<>(Arrays.asList(uVarArr));
                this.f177896d = z15;
                this.f177899g = i15;
                this.f177900h = z16;
                this.f177901i = z17;
                this.f177902j = z18;
            }
        }

        public a(int i15, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i15 != 0 ? IconCompat.d(null, "", i15) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f177891k;
        }

        public boolean b() {
            return this.f177885e;
        }

        public Bundle c() {
            return this.f177881a;
        }

        public IconCompat d() {
            int i15;
            if (this.f177882b == null && (i15 = this.f177889i) != 0) {
                this.f177882b = IconCompat.d(null, "", i15);
            }
            return this.f177882b;
        }

        public u[] e() {
            return this.f177883c;
        }

        public int f() {
            return this.f177887g;
        }

        public boolean g() {
            return this.f177886f;
        }

        public CharSequence h() {
            return this.f177890j;
        }

        public boolean i() {
            return this.f177892l;
        }

        public boolean j() {
            return this.f177888h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, u[] uVarArr, u[] uVarArr2, boolean z15, int i15, boolean z16, boolean z17, boolean z18) {
            this.f177886f = true;
            this.f177882b = iconCompat;
            if (iconCompat != null && iconCompat.h() == 2) {
                this.f177889i = iconCompat.f();
            }
            this.f177890j = e.d(charSequence);
            this.f177891k = pendingIntent;
            this.f177881a = bundle == null ? new Bundle() : bundle;
            this.f177883c = uVarArr;
            this.f177884d = uVarArr2;
            this.f177885e = z15;
            this.f177887g = i15;
            this.f177886f = z16;
            this.f177888h = z17;
            this.f177892l = z18;
        }
    }

    public static class b extends g {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private IconCompat f177903e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private IconCompat f177904f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f177905g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private CharSequence f177906h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f177907i;

        private static class a {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* JADX INFO: renamed from: s5.l$b$b, reason: collision with other inner class name */
        private static class C4549b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z15) {
                bigPictureStyle.showBigPictureWhenCollapsed(z15);
            }
        }

        @Override // s5.l.g
        public void b(k kVar) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(kVar.a()).setBigContentTitle(this.f177946b);
            IconCompat iconCompat = this.f177903e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    C4549b.a(bigContentTitle, this.f177903e.o(kVar instanceof m ? ((m) kVar).f() : null));
                } else if (iconCompat.h() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f177903e.e());
                }
            }
            if (this.f177905g) {
                if (this.f177904f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.a(bigContentTitle, this.f177904f.o(kVar instanceof m ? ((m) kVar).f() : null));
                }
            }
            if (this.f177948d) {
                bigContentTitle.setSummaryText(this.f177947c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                C4549b.c(bigContentTitle, this.f177907i);
                C4549b.b(bigContentTitle, this.f177906h);
            }
        }

        @Override // s5.l.g
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b h(Bitmap bitmap) {
            this.f177904f = bitmap == null ? null : IconCompat.b(bitmap);
            this.f177905g = true;
            return this;
        }

        public b i(Bitmap bitmap) {
            this.f177903e = bitmap == null ? null : IconCompat.b(bitmap);
            return this;
        }
    }

    public static class c extends g {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CharSequence f177908e;

        @Override // s5.l.g
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // s5.l.g
        public void b(k kVar) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(kVar.a()).setBigContentTitle(this.f177946b).bigText(this.f177908e);
            if (this.f177948d) {
                bigTextStyleBigText.setSummaryText(this.f177947c);
            }
        }

        @Override // s5.l.g
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c h(CharSequence charSequence) {
            this.f177908e = e.d(charSequence);
            return this;
        }
    }

    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

```
