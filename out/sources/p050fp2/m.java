package p050fp2;

import dx3.b;
import p071kotlin.Metadata;
import zx.a;
import zx.c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\t¨\u0006\u0014"}, d2 = {"Lfp2/m;", "", "Ldx3/b;", "Lzx/c;", "Ldx3/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "route", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m implements a, b, c<dx3.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f65963a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final String route = "passportagreement/attachmentpreview";

    private m() {
    }

    @Override // zx.a
    /* JADX INFO: renamed from: b */
    public String getRoute() {
        return route;
    }

    @Override // zx.a
    public /* bridge */ boolean e() {
        return super.e();
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof m);
    }

    public int hashCode() {
        return 396744634;
    }

    public String toString() {
        return "AttachmentPreview";
    }
}
