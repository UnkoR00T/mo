package cn;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.aq;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.im;

/* JADX INFO: loaded from: classes4.dex */
final class b extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f28300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final aq f28301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final im f28302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f28303d;

    b(p pVar, aq aqVar, im imVar, boolean z15) {
        this.f28300a = pVar;
        this.f28301b = aqVar;
        if (imVar == null) {
            throw new NullPointerException("Null lineBoxParcels");
        }
        this.f28302c = imVar;
        this.f28303d = z15;
    }

    @Override // cn.o
    public final im a() {
        return this.f28302c;
    }

    @Override // cn.o
    public final aq b() {
        return this.f28301b;
    }

    @Override // cn.o
    public final p c() {
        return this.f28300a;
    }

    @Override // cn.o
    public final boolean d() {
        return this.f28303d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f28300a.equals(oVar.c()) && this.f28301b.equals(oVar.b()) && this.f28302c.equals(oVar.a()) && this.f28303d == oVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f28300a.hashCode() ^ 1000003) * 1000003) ^ this.f28301b.hashCode()) * 1000003) ^ this.f28302c.hashCode()) * 1000003) ^ (true != this.f28303d ? 1237 : 1231);
    }

    public final String toString() {
        im imVar = this.f28302c;
        aq aqVar = this.f28301b;
        return "VkpResults{status=" + this.f28300a.toString() + ", textParcel=" + aqVar.toString() + ", lineBoxParcels=" + imVar.toString() + ", fromColdCall=" + this.f28303d + "}";
    }
}
