package yz;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import dx.i;
import fx.Rectangle;
import java.io.IOException;
import java.util.List;
import oq.k;
import oq.l;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import ux.DetectedFace;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lyz/f;", "Lyz/d;", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;)V", "Lvm/a;", "inputImage", "Lvx/a;", "f", "(Lvm/a;Ltq/e;)Ljava/lang/Object;", "Landroid/graphics/Bitmap;", "bitmap", "a", "(Landroid/graphics/Bitmap;Ltq/e;)Ljava/lang/Object;", "", "imageUri", "c", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "b", "()V", "Landroid/content/Context;", "Lxm/d;", "Loq/k;", "h", "()Lxm/d;", "detector", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context appContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k detector = l.a(new er.a() { // from class: yz.e
        @Override // er.a
        public final Object a() {
            return f.g();
        }
    });

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f230848d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f230849e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f230851g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f230849e = obj;
            this.f230851g |= PKIFailureInfo.systemUnavail;
            return f.this.f(null, this);
        }
    }

    public f(Context context) {
        this.appContext = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(vm.a aVar, tq.e<? super vx.a> eVar) throws Throwable {
        a aVar2;
        if (eVar instanceof a) {
            aVar2 = (a) eVar;
            int i15 = aVar2.f230851g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar2.f230851g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar2 = new a(eVar);
            }
        } else {
            aVar2 = new a(eVar);
        }
        Object objA = aVar2.f230849e;
        Object objE = uq.b.e();
        int i16 = aVar2.f230851g;
        try {
            if (i16 == 0) {
                u.b(objA);
                vh.l<List<xm.a>> lVarX = h().x(aVar);
                aVar2.f230848d = aVar;
                aVar2.f230851g = 1;
                objA = tu.b.a(lVarX, aVar2);
                if (objA == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (vm.a) aVar2.f230848d;
                u.b(objA);
            }
            List list = (List) objA;
            if (list.isEmpty()) {
                return vx.a.InterfaceC5477a.e.f208559a;
            }
            if (list.size() > 1) {
                return vx.a.InterfaceC5477a.d.f208558a;
            }
            i<dx.b, DetectedFace> iVarB = b.b((xm.a) v.l0(list));
            if (iVarB instanceof i.Left) {
                return vx.a.InterfaceC5477a.c.f208557a;
            }
            if (iVarB instanceof i.Right) {
                return new vx.a.Success((DetectedFace) ((i.Right) iVarB).b(), new Rectangle(aVar.m(), aVar.i()));
            }
            throw new p();
        } catch (lm.a e15) {
            return a00.a.a(e15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xm.d g() {
        return xm.c.b(new xm.e.a().f(1).b(2).d(2).c(2).e(0.15f).a());
    }

    private final xm.d h() {
        return (xm.d) this.detector.getValue();
    }

    @Override // yz.d
    public Object a(Bitmap bitmap, tq.e<? super vx.a> eVar) {
        try {
            return f(vm.a.a(bitmap, 0), eVar);
        } catch (IOException unused) {
            return vx.a.InterfaceC5477a.C5478a.f208554a;
        }
    }

    @Override // yz.d
    public void b() {
        h().close();
    }

    @Override // yz.d
    public Object c(String str, tq.e<? super vx.a> eVar) {
        try {
            return f(vm.a.c(this.appContext, Uri.parse(str)), eVar);
        } catch (IOException unused) {
            return vx.a.InterfaceC5477a.C5478a.f208554a;
        }
    }
}
