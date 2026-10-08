package nv;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lnv/c;", "", "Lvv/h;", "name", "value", "<init>", "(Lvv/h;Lvv/h;)V", "", "(Ljava/lang/String;Ljava/lang/String;)V", "(Lvv/h;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "()Lvv/h;", "b", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lvv/h;", "c", "I", "hpackSize", "d", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final vv.h f138913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final vv.h f138914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final vv.h f138915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final vv.h f138916h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final vv.h f138917i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final vv.h f138918j;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final vv.h name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final vv.h value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int hpackSize;

    static {
        vv.h.Companion companion = vv.h.INSTANCE;
        f138913e = companion.d(":");
        f138914f = companion.d(":status");
        f138915g = companion.d(":method");
        f138916h = companion.d(":path");
        f138917i = companion.d(":scheme");
        f138918j = companion.d(":authority");
    }

    public c(vv.h hVar, vv.h hVar2) {
        this.name = hVar;
        this.value = hVar2;
        this.hpackSize = hVar.Q() + 32 + hVar2.Q();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final vv.h getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final vv.h getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return t.c(this.name, cVar.name) && t.c(this.value, cVar.value);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return this.name.Y() + ": " + this.value.Y();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(String str, String str2) {
        vv.h.Companion companion = vv.h.INSTANCE;
        this(companion.d(str), companion.d(str2));
    }

    public c(vv.h hVar, String str) {
        this(hVar, vv.h.INSTANCE.d(str));
    }
}
