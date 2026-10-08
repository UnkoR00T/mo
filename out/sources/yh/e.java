package yh;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends kg.a {
    public static final Parcelable.Creator<e> CREATOR = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList f226820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f226821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f226822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList f226823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f226824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f226825f;

    @Deprecated
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f226826a;

        /* synthetic */ a(e eVar, byte[] bArr) {
            Objects.requireNonNull(eVar);
            this.f226826a = eVar;
        }

        public e a() {
            return this.f226826a;
        }
    }

    e() {
    }

    public static e h(String str) {
        a aVarM = m();
        aVarM.f226826a.f226825f = (String) jg.s.m(str, "isReadyToPayRequestJson cannot be null!");
        return aVarM.a();
    }

    @Deprecated
    public static a m() {
        return new a(new e(), null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.o(parcel, 2, this.f226820a, false);
        kg.c.u(parcel, 4, this.f226821b, false);
        kg.c.u(parcel, 5, this.f226822c, false);
        kg.c.o(parcel, 6, this.f226823d, false);
        kg.c.c(parcel, 7, this.f226824e);
        kg.c.u(parcel, 8, this.f226825f, false);
        kg.c.b(parcel, iA);
    }

    e(ArrayList arrayList, String str, String str2, ArrayList arrayList2, boolean z15, String str3) {
        this.f226820a = arrayList;
        this.f226821b = str;
        this.f226822c = str2;
        this.f226823d = arrayList2;
        this.f226824e = z15;
        this.f226825f = str3;
    }
}
