# Paczka 187 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `s5/l.java (część 2/3)`

## s5/l.java (część 2/3)

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
```
