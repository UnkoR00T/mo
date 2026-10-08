package zc;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: zc.e, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lzc/e;", "Lzc/i;", "Lkc/n;", "image", "Lzc/f;", "request", "", "throwable", "<init>", "(Lkc/n;Lzc/f;Ljava/lang/Throwable;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lkc/n;", "()Lkc/n;", "b", "Lzc/f;", "()Lzc/f;", "c", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ErrorResult implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final kc.n image;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ImageRequest request;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Throwable throwable;

    public ErrorResult(kc.n nVar, ImageRequest imageRequest, Throwable th4) {
        this.image = nVar;
        this.request = imageRequest;
        this.throwable = th4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public kc.n getImage() {
        return this.image;
    }

    @Override // zc.i
    /* JADX INFO: renamed from: b, reason: from getter */
    public ImageRequest getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorResult)) {
            return false;
        }
        ErrorResult errorResult = (ErrorResult) other;
        return fr.t.c(this.image, errorResult.image) && fr.t.c(this.request, errorResult.request) && fr.t.c(this.throwable, errorResult.throwable);
    }

    public int hashCode() {
        kc.n nVar = this.image;
        return ((((nVar == null ? 0 : nVar.hashCode()) * 31) + this.request.hashCode()) * 31) + this.throwable.hashCode();
    }

    public String toString() {
        return "ErrorResult(image=" + this.image + ", request=" + this.request + ", throwable=" + this.throwable + ")";
    }
}
