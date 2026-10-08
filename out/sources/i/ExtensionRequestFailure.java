package i;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: i.g3, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0016¨\u0006)"}, d2 = {"Li/g3;", "Lh/h1;", "Lh/i1;", "requestMetadata", "", "wasImageCaptured", "Lh/r0;", "frameNumber", "", "reason", "<init>", "(Lh/i1;ZJILfr/k;)V", "", "T", "Lmr/c;", "type", "c0", "(Lmr/c;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lh/i1;", "getRequestMetadata", "()Lh/i1;", "b", "Z", "C", "()Z", "c", "J", "getFrameNumber-Ugla2oM", "()J", "d", "I", "C0", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ExtensionRequestFailure implements h.h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final h.i1 requestMetadata;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean wasImageCaptured;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long frameNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int reason;

    public /* synthetic */ ExtensionRequestFailure(h.i1 i1Var, boolean z15, long j15, int i15, fr.k kVar) {
        this(i1Var, z15, j15, i15);
    }

    @Override // h.h1
    /* JADX INFO: renamed from: C, reason: from getter */
    public boolean getWasImageCaptured() {
        return this.wasImageCaptured;
    }

    @Override // h.h1
    /* JADX INFO: renamed from: C0, reason: from getter */
    public int getReason() {
        return this.reason;
    }

    @Override // h.t1
    public <T> T c0(mr.c<T> type) {
        return null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtensionRequestFailure)) {
            return false;
        }
        ExtensionRequestFailure extensionRequestFailure = (ExtensionRequestFailure) other;
        return fr.t.c(this.requestMetadata, extensionRequestFailure.requestMetadata) && this.wasImageCaptured == extensionRequestFailure.wasImageCaptured && h.r0.d(this.frameNumber, extensionRequestFailure.frameNumber) && this.reason == extensionRequestFailure.reason;
    }

    public int hashCode() {
        return (((((this.requestMetadata.hashCode() * 31) + Boolean.hashCode(this.wasImageCaptured)) * 31) + h.r0.e(this.frameNumber)) * 31) + Integer.hashCode(this.reason);
    }

    public String toString() {
        return "ExtensionRequestFailure(requestMetadata=" + this.requestMetadata + ", wasImageCaptured=" + this.wasImageCaptured + ", frameNumber=" + ((Object) h.r0.f(this.frameNumber)) + ", reason=" + this.reason + ')';
    }

    private ExtensionRequestFailure(h.i1 i1Var, boolean z15, long j15, int i15) {
        this.requestMetadata = i1Var;
        this.wasImageCaptured = z15;
        this.frameNumber = j15;
        this.reason = i15;
    }
}
