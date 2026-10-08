# Paczka 132 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `ii/l0.java`

## ii/l0.java

```java
package ii;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.time.ZoneId;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l0 implements Parcelable {

    public enum a implements Parcelable {
        UNKNOWN,
        TRUE,
        FALSE;


        @RecentlyNonNull
        public static final Parcelable.Creator<a> CREATOR = new d7();

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i15) {
            parcel.writeString(name());
        }
    }

    public static abstract class b {
        @RecentlyNonNull
        public abstract b A(@RecentlyNonNull a aVar);

        @RecentlyNonNull
        public abstract b B(x xVar);

        @RecentlyNonNull
        public abstract b C(Uri uri);

        @RecentlyNonNull
        public abstract b D(Integer num);

        @RecentlyNonNull
        public abstract b E(String str);

        @RecentlyNonNull
        public abstract b F(String str);

        @RecentlyNonNull
        public abstract b G(String str);

        @RecentlyNonNull
        public abstract b H(@RecentlyNonNull a aVar);

        @RecentlyNonNull
        public abstract b I(LatLng latLng);

        @RecentlyNonNull
        public abstract b J(@RecentlyNonNull a aVar);

        @RecentlyNonNull
        public abstract b K(String str);

        @RecentlyNonNull
        public abstract b L(f0 f0Var);

        @RecentlyNonNull
        public abstract b M(g0 g0Var);

        @RecentlyNonNull
        public abstract b N(@RecentlyNonNull a aVar);

        @RecentlyNonNull
        public abstract b O(h0 h0Var);

        @RecentlyNonNull
        public abstract b P(i0 i0Var);

        @RecentlyNonNull
        public abstract b Q(List<k0> list);

        @RecentlyNonNull
        public abstract b R(List<String> list);

        @RecentlyNonNull
        public abstract b S(n0 n0Var);

        @RecentlyNonNull
        public abstract b T(o0 o0Var);

        @RecentlyNonNull
        public abstract b U(Integer num);

        @RecentlyNonNull
        public abstract b V(p0 p0Var);

        @RecentlyNonNull
        public abstract b W(String str);

        @RecentlyNonNull
        public abstract b X(String str);

        @RecentlyNonNull
        public abstract b Y(String str);

        @RecentlyNonNull
        public abstract b Z(@RecentlyNonNull a aVar);

        @RecentlyNonNull
        @SuppressLint({"AmbiguousGranuleClass"})
        public l0 a() {
            l0 l0VarZ0 = z0();
            List<String> listG = l0VarZ0.g();
            if (listG != null) {
                Iterator<String> it = listG.iterator();
                while (it.hasNext()) {
                    zj.p.e(!TextUtils.isEmpty(it.next()), "Attributions must not contain null or empty values.");
                }
            }
            Integer numU = l0VarZ0.U();
            if (numU != null) {
                zj.p.n(ak.q1.d(0, 4).g(numU), "Price Level must not be out-of-range: %s to %s, but was: %s.", 0, 4, numU);
            }
            Double dA0 = l0VarZ0.a0();
            if (dA0 != null) {
                Double dValueOf = Double.valueOf(1.0d);
                Double dValueOf2 = Double.valueOf(5.0d);
                zj.p.n(ak.q1.d(dValueOf, dValueOf2).g(dA0), "Rating must not be out-of-range: %s to %s, but was: %s.", dValueOf, dValueOf2, dA0);
            }
            Integer numV0 = l0VarZ0.v0();
            if (numV0 != null) {
                zj.p.l(ak.q1.c(0).g(numV0), "User Ratings Total must not be < 0, but was: %s.", numV0);
            }
            if (listG != null) {
                g(ak.n0.v(listG));
            }
            List<k0> listQ = l0VarZ0.Q();
            if (listQ != null) {
                Q(ak.n0.v(listQ));
            }
            List<String> listR = l0VarZ0.R();
            if (listR != null) {
                R(ak.n0.v(listR));
            }
            List<g0> listG0 = l0VarZ0.g0();
            if (listG0 != null) {
                g0(ak.n0.v(listG0));
            }
            List<r0> listF0 = l0VarZ0.f0();
            if (listF0 != null) {
                f0(ak.n0.v(listF0));
            }
            List<n> listJ = l0VarZ0.j();
            if (listJ != null) {
                j(ak.n0.v(listJ));
            }
            return z0();
        }

        @RecentlyNonNull
        public abstract b a0(Double d15);

        @RecentlyNonNull
        public abstract b b(ii.a aVar);

        @RecentlyNonNull
        public abstract b b0(@RecentlyNonNull a aVar);

        @RecentlyNonNull
        public abstract b c(ii.c cVar);

        @RecentlyNonNull
        public abstract b c0(String str);

        @RecentlyNonNull
        public abstract b d(ii.d dVar);

        @RecentlyNonNull
        public abstract b d0(@RecentlyNonNull a aVar);

        @RecentlyNonNull
        public abstract b e(String str);

        @RecentlyNonNull
        public abstract b e0(s0 s0Var);

        @RecentlyNonNull
        public abstract b f(@RecentlyNonNull a aVar);

        @RecentlyNonNull
        public abstract b f0(List<r0> list);

        @RecentlyNonNull
        public abstract b g(List<String> list);

        @RecentlyNonNull
        public abstract b g0(List<g0> list);

        @RecentlyNonNull
        public abstract b h(c cVar);

        @RecentlyNonNull
        public abstract b h0(@RecentlyNonNull a aVar);

        @RecentlyNonNull
        public abstract b i(l lVar);

        @RecentlyNonNull
        public abstract b i0(@RecentlyNonNull a aVar);

        @RecentlyNonNull
        public abstract b j(List<n> list);

        @RecentlyNonNull
        public abstract b j0(@RecentlyNonNull a aVar);

        @RecentlyNonNull
        public abstract b k(@RecentlyNonNull a aVar);

        @RecentlyNonNull
        public abstract b k0(@RecentlyNonNull a aVar);

        @RecentlyNonNull
        public abstract b l(g0 g0Var);

        @RecentlyNonNull
        public abstract b l0(@RecentlyNonNull a aVar);

        @RecentlyNonNull
        public abstract b m(List<g0> list);

        @RecentlyNonNull
        public abstract b m0(@RecentlyNonNull a aVar);

        @RecentlyNonNull
        public abstract b n(@RecentlyNonNull a aVar);

        @RecentlyNonNull
        public abstract b n0(@RecentlyNonNull a aVar);

        @RecentlyNonNull
        public abstract b o(@RecentlyNonNull a aVar);

        @RecentlyNonNull
        public abstract b o0(@RecentlyNonNull a aVar);

        @RecentlyNonNull
        public abstract b p(String str);

        @RecentlyNonNull
        public abstract b p0(@RecentlyNonNull a aVar);

        @RecentlyNonNull
        public abstract b q(String str);

        @RecentlyNonNull
        public abstract b q0(@RecentlyNonNull a aVar);

        @RecentlyNonNull
        public abstract b r(String str);

        @RecentlyNonNull
        public abstract b r0(String str);

        @RecentlyNonNull
        public abstract b s(String str);

        @RecentlyNonNull
        public abstract b s0(List<x0> list);

        @RecentlyNonNull
        public abstract b t(t tVar);

        @RecentlyNonNull
        public abstract b t0(@RecentlyNonNull a aVar);

        @RecentlyNonNull
        public abstract b u(q qVar);

        @RecentlyNonNull
        public abstract b u0(ZoneId zoneId);

        @RecentlyNonNull
        public abstract b v(String str);

        @RecentlyNonNull
        public abstract b v0(Integer num);

        @RecentlyNonNull
        public abstract b w(u uVar);

        @RecentlyNonNull
        public abstract b w0(Integer num);

        @RecentlyNonNull
        public abstract b x(w wVar);

        @RecentlyNonNull
        public abstract b x0(LatLngBounds latLngBounds);

        @RecentlyNonNull
        public abstract b y(@RecentlyNonNull a aVar);

        @RecentlyNonNull
        public abstract b y0(Uri uri);

        @RecentlyNonNull
        public abstract b z(@RecentlyNonNull a aVar);

        abstract l0 z0();
    }

    public enum c implements Parcelable {
        OPERATIONAL,
        CLOSED_TEMPORARILY,
        CLOSED_PERMANENTLY;


        @RecentlyNonNull
        public static final Parcelable.Creator<c> CREATOR = new e7();

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i15) {
            parcel.writeString(name());
        }
    }

    public enum d implements Parcelable {
        ACCESSIBILITY_OPTIONS,
        ADDRESS_COMPONENTS,
        ADDRESS_DESCRIPTOR,
        ADR_FORMAT_ADDRESS,
        ALLOWS_DOGS,
        BUSINESS_STATUS,
        CONSUMER_ALERT,
        CONTAINING_PLACES,
        CURBSIDE_PICKUP,
        CURRENT_OPENING_HOURS,
        CURRENT_SECONDARY_OPENING_HOURS,
        DELIVERY,
        DINE_IN,
        DISPLAY_NAME,
        EDITORIAL_SUMMARY,
        EV_CHARGE_AMENITY_SUMMARY,
        EV_CHARGE_OPTIONS,
        FORMATTED_ADDRESS,
        FUEL_OPTIONS,
        GENERATIVE_SUMMARY,
        GOOD_FOR_CHILDREN,
        GOOD_FOR_GROUPS,
        GOOD_FOR_WATCHING_SPORTS,
        GOOGLE_MAPS_LINKS,
        GOOGLE_MAPS_URI,
        ICON_BACKGROUND_COLOR,
        ICON_MASK_URL,
        ID,
        INTERNATIONAL_PHONE_NUMBER,
        LIVE_MUSIC,
        LOCATION,
        MENU_FOR_CHILDREN,
        NATIONAL_PHONE_NUMBER,
        NEIGHBORHOOD_SUMMARY,
        OPENING_HOURS,
        OUTDOOR_SEATING,
        PARKING_OPTIONS,
        PAYMENT_OPTIONS,
        PHOTO_METADATAS,
        PLUS_CODE,
        POSTAL_ADDRESS,
        PRICE_LEVEL,
        PRICE_RANGE,
        PRIMARY_TYPE,
        PRIMARY_TYPE_DISPLAY_NAME,
        PURE_SERVICE_AREA_BUSINESS,
        RATING,
        RESERVABLE,
        RESOURCE_NAME,
        RESTROOM,
        REVIEWS,
        REVIEW_SUMMARY,
        SECONDARY_OPENING_HOURS,
        SERVES_BEER,
        SERVES_BREAKFAST,
        SERVES_BRUNCH,
        SERVES_COCKTAILS,
        SERVES_COFFEE,
        SERVES_DESSERT,
        SERVES_DINNER,
        SERVES_LUNCH,
        SERVES_VEGETARIAN_FOOD,
        SERVES_WINE,
        SHORT_FORMATTED_ADDRESS,
        SUB_DESTINATIONS,
        TAKEOUT,
        TIME_ZONE,
        TYPES,
        USER_RATING_COUNT,
        UTC_OFFSET,
        VIEWPORT,
        WEBSITE_URI;


        @RecentlyNonNull
        public static final Parcelable.Creator<d> CREATOR = new f7();

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i15) {
            parcel.writeString(name());
        }
    }

    @RecentlyNonNull
    public static b a() {
        k2 k2Var = new k2();
        a aVar = a.UNKNOWN;
        k2Var.k(aVar);
        k2Var.n(aVar);
        k2Var.o(aVar);
        k2Var.b0(aVar);
        k2Var.h0(aVar);
        k2Var.i0(aVar);
        k2Var.j0(aVar);
        k2Var.n0(aVar);
        k2Var.o0(aVar);
        k2Var.p0(aVar);
        k2Var.q0(aVar);
        k2Var.t0(aVar);
        k2Var.N(aVar);
        k2Var.H(aVar);
        k2Var.J(aVar);
        k2Var.k0(aVar);
        k2Var.m0(aVar);
        k2Var.l0(aVar);
        k2Var.y(aVar);
        k2Var.f(aVar);
        k2Var.d0(aVar);
        k2Var.z(aVar);
        k2Var.A(aVar);
        k2Var.Z(aVar);
        return k2Var;
    }

    @RecentlyNonNull
    public abstract a A();

    @RecentlyNullable
    public abstract x B();

    @RecentlyNullable
    public abstract Uri C();

    @RecentlyNullable
    public abstract Integer D();

    @RecentlyNullable
    public abstract String E();

    @RecentlyNullable
    public abstract String F();

    @RecentlyNullable
    public abstract String G();

    @RecentlyNonNull
    public abstract a H();

    @RecentlyNullable
    public abstract LatLng I();

    @RecentlyNonNull
    public abstract a J();

    @RecentlyNullable
    public abstract String K();

    @RecentlyNullable
    public abstract f0 L();

    @RecentlyNullable
    public abstract g0 M();

    @RecentlyNonNull
    public abstract a N();

    @RecentlyNullable
    public abstract h0 O();

    @RecentlyNullable
    public abstract i0 P();

    @RecentlyNullable
    public abstract List<k0> Q();

    @RecentlyNullable
    public abstract List<String> R();

    @RecentlyNullable
    public abstract n0 S();

    @RecentlyNullable
    public abstract o0 T();

    @RecentlyNullable
    public abstract Integer U();

    @RecentlyNullable
    public abstract p0 V();

    @RecentlyNullable
    public abstract String W();

    @RecentlyNullable
    public abstract String X();

    @RecentlyNullable
    public abstract String Y();

    @RecentlyNonNull
    public abstract a Z();

    @RecentlyNullable
    public abstract Double a0();

    @RecentlyNullable
    public abstract ii.a b();

    @RecentlyNonNull
    public abstract a b0();

    @RecentlyNullable
    public abstract ii.c c();

    @RecentlyNullable
    public abstract String c0();

    @RecentlyNullable
    public abstract ii.d d();

    @RecentlyNonNull
    public abstract a d0();

    @RecentlyNullable
    public abstract String e();

    @RecentlyNullable
    public abstract s0 e0();

    @RecentlyNonNull
    public abstract a f();

    @RecentlyNullable
    public abstract List<r0> f0();

    @RecentlyNullable
    public abstract List<String> g();

    @RecentlyNullable
    public abstract List<g0> g0();

    @RecentlyNullable
    public abstract c h();

    @RecentlyNonNull
    public abstract a h0();

    @RecentlyNullable
    public abstract l i();

    @RecentlyNonNull
    public abstract a i0();

    @RecentlyNullable
    public abstract List<n> j();

    @RecentlyNonNull
    public abstract a j0();

    @RecentlyNonNull
    public abstract a k();

    @RecentlyNonNull
    public abstract a k0();

    @RecentlyNullable
    public abstract g0 l();

    @RecentlyNonNull
    public abstract a l0();

    @RecentlyNullable
    public abstract List<g0> m();

    @RecentlyNonNull
    public abstract a m0();

    @RecentlyNonNull
    public abstract a n();

    @RecentlyNonNull
    public abstract a n0();

    @RecentlyNonNull
    public abstract a o();

    @RecentlyNonNull
    public abstract a o0();

    @RecentlyNullable
    public abstract String p();

    @RecentlyNonNull
    public abstract a p0();

    @RecentlyNullable
    public abstract String q();

    @RecentlyNonNull
    public abstract a q0();

    @RecentlyNullable
    public abstract String r();

    @RecentlyNullable
    public abstract String r0();

    @RecentlyNullable
    public abstract String s();

    @RecentlyNullable
    public abstract List<x0> s0();

    @RecentlyNullable
    public abstract t t();

    @RecentlyNonNull
    public abstract a t0();

    @RecentlyNullable
    public abstract q u();

    @RecentlyNullable
    public abstract ZoneId u0();

    @RecentlyNullable
    public abstract String v();

    @RecentlyNullable
    public abstract Integer v0();

    @RecentlyNullable
    public abstract u w();

    @RecentlyNullable
    public abstract Integer w0();

    @RecentlyNullable
    public abstract w x();

    @RecentlyNullable
    public abstract LatLngBounds x0();

    @RecentlyNonNull
    public abstract a y();

    @RecentlyNullable
    public abstract Uri y0();

    @RecentlyNonNull
    public abstract a z();
}

```
