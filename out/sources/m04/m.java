package m04;

import iy.b0;
import java.util.concurrent.CancellationException;
import oq.p;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096B¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lm04/m;", "Lg04/m;", "Liy/l;", CMSAttributeTableGenerator.DIGEST, "Liy/c;", "bytesConverter", "Liy/e;", "bytesManager", "Liy/a;", "base64Coder", "Ljx/d;", "deviceInfo", "<init>", "(Liy/l;Liy/c;Liy/e;Liy/a;Ljx/d;)V", "Liy/b0;", "params", "Ldx/i;", "Ldx/b;", "", "d", "(Liy/b0;Ltq/e;)Ljava/lang/Object;", "a", "Liy/l;", "b", "Liy/c;", "c", "Liy/e;", "Liy/a;", "e", "Ljx/d;", "biometric_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements g04.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.l digest;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.c bytesConverter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.e bytesManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final jx.d deviceInfo;

    public m(iy.l lVar, iy.c cVar, iy.e eVar, iy.a aVar, jx.d dVar) {
        this.digest = lVar;
        this.bytesConverter = cVar;
        this.bytesManager = eVar;
        this.base64Coder = aVar;
        this.deviceInfo = dVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(b0 b0Var, tq.e<? super dx.i<? extends dx.b, String>> eVar) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    return new dx.i.Right(iy.a.e(this.base64Coder, (byte[]) new ex.a().a(iy.l.a(this.digest, this.bytesManager.c(this.deviceInfo.b().getBytes(fu.d.UTF_8), iy.c.b(this.bytesConverter, b0Var.getData(), null, 2, null)), null, 2, null)), null, 2, null));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }
}
