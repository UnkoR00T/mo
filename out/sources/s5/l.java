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

    public static class f extends g {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f177935e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private s f177936f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private PendingIntent f177937g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private PendingIntent f177938h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private PendingIntent f177939i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f177940j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Integer f177941k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Integer f177942l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private IconCompat f177943m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private CharSequence f177944n;

        static class a {
            static Notification.Builder a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            static Notification.Builder b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        static class b {
            static Parcelable a(Icon icon) {
                return icon;
            }

            static void b(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        static class c {
            static Notification.Builder a(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }

            static Parcelable b(Person person) {
                return person;
            }
        }

        static class d {
            static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle d(Notification.CallStyle callStyle, int i15) {
                return callStyle.setAnswerButtonColorHint(i15);
            }

            static Notification.CallStyle e(Notification.CallStyle callStyle, int i15) {
                return callStyle.setDeclineButtonColorHint(i15);
            }

            static Notification.CallStyle f(Notification.CallStyle callStyle, boolean z15) {
                return callStyle.setIsVideo(z15);
            }

            static Notification.CallStyle g(Notification.CallStyle callStyle, Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            static Notification.CallStyle h(Notification.CallStyle callStyle, CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        private String i() {
            int i15 = this.f177935e;
            if (i15 == 1) {
                return this.f177945a.f177909a.getResources().getString(r5.f.f171834e);
            }
            if (i15 == 2) {
                return this.f177945a.f177909a.getResources().getString(r5.f.f171835f);
            }
            if (i15 != 3) {
                return null;
            }
            return this.f177945a.f177909a.getResources().getString(r5.f.f171836g);
        }

        private boolean j(a aVar) {
            return aVar != null && aVar.c().getBoolean("key_action_priority");
        }

        private a k(int i15, int i16, Integer num, int i17, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(u5.a.d(this.f177945a.f177909a, i17));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f177945a.f177909a.getResources().getString(i16));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            a aVarA = new a.C4548a(IconCompat.c(this.f177945a.f177909a, i15), spannableStringBuilder, pendingIntent).a();
            aVarA.c().putBoolean("key_action_priority", true);
            return aVarA;
        }

        private a l() {
            int i15 = r5.d.f171802b;
            int i16 = r5.d.f171801a;
            PendingIntent pendingIntent = this.f177937g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z15 = this.f177940j;
            return k(z15 ? i15 : i16, z15 ? r5.f.f171831b : r5.f.f171830a, this.f177941k, r5.b.f171797a, pendingIntent);
        }

        private a m() {
            int i15 = r5.d.f171803c;
            PendingIntent pendingIntent = this.f177938h;
            return pendingIntent == null ? k(i15, r5.f.f171833d, this.f177942l, r5.b.f171798b, this.f177939i) : k(i15, r5.f.f171832c, this.f177942l, r5.b.f171798b, pendingIntent);
        }

        @Override // s5.l.g
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putInt("android.callType", this.f177935e);
            bundle.putBoolean("android.callIsVideo", this.f177940j);
            s sVar = this.f177936f;
            if (sVar != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("android.callPerson", c.b(sVar.h()));
                } else {
                    bundle.putParcelable("android.callPersonCompat", sVar.i());
                }
            }
            IconCompat iconCompat = this.f177943m;
            if (iconCompat != null) {
                bundle.putParcelable("android.verificationIcon", b.a(iconCompat.o(this.f177945a.f177909a)));
            }
            bundle.putCharSequence("android.verificationText", this.f177944n);
            bundle.putParcelable("android.answerIntent", this.f177937g);
            bundle.putParcelable("android.declineIntent", this.f177938h);
            bundle.putParcelable("android.hangUpIntent", this.f177939i);
            Integer num = this.f177941k;
            if (num != null) {
                bundle.putInt("android.answerColor", num.intValue());
            }
            Integer num2 = this.f177942l;
            if (num2 != null) {
                bundle.putInt("android.declineColor", num2.intValue());
            }
        }

        @Override // s5.l.g
        public void b(k kVar) {
            int i15 = Build.VERSION.SDK_INT;
            CharSequence charSequenceI = null;
            callStyleA = null;
            Notification.CallStyle callStyleA = null;
            charSequenceI = null;
            if (i15 < 31) {
                Notification.Builder builderA = kVar.a();
                s sVar = this.f177936f;
                builderA.setContentTitle(sVar != null ? sVar.c() : null);
                Bundle bundle = this.f177945a.E;
                if (bundle != null && bundle.containsKey("android.text")) {
                    charSequenceI = this.f177945a.E.getCharSequence("android.text");
                }
                if (charSequenceI == null) {
                    charSequenceI = i();
                }
                builderA.setContentText(charSequenceI);
                s sVar2 = this.f177936f;
                if (sVar2 != null) {
                    if (sVar2.a() != null) {
                        b.b(builderA, this.f177936f.a().o(this.f177945a.f177909a));
                    }
                    if (i15 >= 28) {
                        c.a(builderA, this.f177936f.h());
                    } else {
                        a.a(builderA, this.f177936f.d());
                    }
                }
                a.b(builderA, "call");
                return;
            }
            int i16 = this.f177935e;
            if (i16 == 1) {
                callStyleA = d.a(this.f177936f.h(), this.f177938h, this.f177937g);
            } else if (i16 == 2) {
                callStyleA = d.b(this.f177936f.h(), this.f177939i);
            } else if (i16 == 3) {
                callStyleA = d.c(this.f177936f.h(), this.f177939i, this.f177937g);
            } else if (Log.isLoggable("NotifCompat", 3)) {
                String.valueOf(this.f177935e);
            }
            if (callStyleA != null) {
                callStyleA.setBuilder(kVar.a());
                Integer num = this.f177941k;
                if (num != null) {
                    d.d(callStyleA, num.intValue());
                }
                Integer num2 = this.f177942l;
                if (num2 != null) {
                    d.e(callStyleA, num2.intValue());
                }
                d.h(callStyleA, this.f177944n);
                IconCompat iconCompat = this.f177943m;
                if (iconCompat != null) {
                    d.g(callStyleA, iconCompat.o(this.f177945a.f177909a));
                }
                d.f(callStyleA, this.f177940j);
            }
        }

        @Override // s5.l.g
        protected String c() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        public ArrayList<a> h() {
            a aVarM = m();
            a aVarL = l();
            ArrayList<a> arrayList = new ArrayList<>(3);
            arrayList.add(aVarM);
            ArrayList<a> arrayList2 = this.f177945a.f177910b;
            int i15 = 2;
            if (arrayList2 != null) {
                for (a aVar : arrayList2) {
                    if (aVar.j()) {
                        arrayList.add(aVar);
                    } else if (!j(aVar)) {
                        arrayList.add(aVar);
                        i15--;
                    }
                    if (aVarL != null && i15 == 1) {
                        arrayList.add(aVarL);
                        i15--;
                    }
                }
            }
            if (aVarL != null && i15 >= 1) {
                arrayList.add(aVarL);
            }
            return arrayList;
        }
    }

    public static abstract class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected e f177945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        CharSequence f177946b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        CharSequence f177947c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f177948d = false;

        public void a(Bundle bundle) {
            if (this.f177948d) {
                bundle.putCharSequence("android.summaryText", this.f177947c);
            }
            CharSequence charSequence = this.f177946b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strC = c();
            if (strC != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
            }
        }

        public abstract void b(k kVar);

        protected abstract String c();

        public RemoteViews d(k kVar) {
            return null;
        }

        public RemoteViews e(k kVar) {
            return null;
        }

        public RemoteViews f(k kVar) {
            return null;
        }

        public void g(e eVar) {
            if (this.f177945a != eVar) {
                this.f177945a = eVar;
                if (eVar != null) {
                    eVar.v(this);
                }
            }
        }
    }

    @Deprecated
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
