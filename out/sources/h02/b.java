package h02;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import eo0.CentralTokens;
import eo0.OwTokens;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lh02/b;", "Lj02/b;", "<init>", "()V", "Leo0/i0$a;", "token", "Loq/i0;", "G", "(Leo0/i0$a;Ltq/e;)Ljava/lang/Object;", "Leo0/i0$c;", "O", "(Leo0/i0$c;Ltq/e;)Ljava/lang/Object;", "Leo0/k$a;", "z", "(Leo0/k$a;Ltq/e;)Ljava/lang/Object;", "C", "(Ltq/e;)Ljava/lang/Object;", "t", i.f37086m, "clear", "a", "Leo0/i0$a;", "owAccessToken", "b", "Leo0/i0$c;", "owRefreshToken", "c", "Leo0/k$a;", "centralAccessToken", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements j02.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private OwTokens.Access owAccessToken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private OwTokens.Refresh owRefreshToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private CentralTokens.Access centralAccessToken;

    @Override // j02.b
    public Object C(e<? super OwTokens.Access> eVar) {
        return this.owAccessToken;
    }

    @Override // j02.b
    public Object G(OwTokens.Access access, e<? super i0> eVar) {
        this.owAccessToken = access;
        return i0.f148189a;
    }

    @Override // j02.b
    public Object O(OwTokens.Refresh refresh, e<? super i0> eVar) {
        this.owRefreshToken = refresh;
        return i0.f148189a;
    }

    @Override // j02.b
    public Object P(e<? super CentralTokens.Access> eVar) {
        return this.centralAccessToken;
    }

    @Override // wy.c
    public void clear() {
        this.owAccessToken = null;
        this.owRefreshToken = null;
        this.centralAccessToken = null;
    }

    @Override // j02.b
    public Object t(e<? super OwTokens.Refresh> eVar) {
        return this.owRefreshToken;
    }

    @Override // j02.b
    public Object z(CentralTokens.Access access, e<? super i0> eVar) {
        this.centralAccessToken = access;
        return i0.f148189a;
    }
}
