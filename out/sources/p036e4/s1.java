package p036e4;

import c5.r;
import er.l;
import f3.m;
import g4.k0;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Le4/s1;", "Lf3/m$c;", "Lg4/k0;", "Lkotlin/Function1;", "Lc5/r;", "Loq/i0;", "onSizeChanged", "<init>", "(Ler/l;)V", "n3", "size", "e", "(J)V", "r", "Ler/l;", "", "s", "Z", "R2", "()Z", "shouldAutoInvalidate", "t", "J", "previousSize", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s1 extends m.c implements k0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private l<? super r, i0> onSizeChanged;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private long previousSize;

    public s1(l<? super r, i0> lVar) {
        this.onSizeChanged = lVar;
        long j15 = PKIFailureInfo.systemUnavail;
        this.previousSize = r.c((j15 & BodyPartID.bodyIdMax) | (j15 << 32));
    }

    @Override // f3.m.c
    /* JADX INFO: renamed from: R2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // g4.k0
    public void e(long size) {
        if (r.e(this.previousSize, size)) {
            return;
        }
        this.onSizeChanged.b(r.b(size));
        this.previousSize = size;
    }

    public final void n3(l<? super r, i0> onSizeChanged) {
        this.onSizeChanged = onSizeChanged;
        long j15 = PKIFailureInfo.systemUnavail;
        this.previousSize = r.c((j15 & BodyPartID.bodyIdMax) | (j15 << 32));
    }
}
