package p90;

import iy.a0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import uq.b;
import vq.d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {"Lp90/a;", "Lub4/a;", "Lvg0/a;", "userRepository", "<init>", "(Lvg0/a;)V", "Lqy/b;", "a", "(Ltq/e;)Ljava/lang/Object;", "wrappedMasterKey", "", "b", "(Liy/a0;Ltq/e;)Ljava/lang/Object;", "Lvg0/a;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements ub4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final vg0.a userRepository;

    /* JADX INFO: renamed from: p90.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3792a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f153563d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f153565f;

        C3792a(e<? super C3792a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            this.f153563d = obj;
            this.f153565f |= PKIFailureInfo.systemUnavail;
            Object objA = a.this.a(this);
            return objA == b.e() ? objA : qy.b.a((a0) objA);
        }
    }

    public a(vg0.a aVar) {
        this.userRepository = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ub4.a
    public Object a(e<? super qy.b> eVar) throws Throwable {
        C3792a c3792a;
        Object objA;
        if (eVar instanceof C3792a) {
            c3792a = (C3792a) eVar;
            int i15 = c3792a.f153565f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c3792a.f153565f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c3792a = new C3792a(eVar);
            }
        } else {
            c3792a = new C3792a(eVar);
        }
        Object obj = c3792a.f153563d;
        Object objE = b.e();
        int i16 = c3792a.f153565f;
        if (i16 == 0) {
            u.b(obj);
            vg0.a aVar = this.userRepository;
            c3792a.f153565f = 1;
            objA = aVar.a(c3792a);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            objA = ((qy.b) obj).getValue();
        }
        return (a0) objA;
    }

    @Override // ub4.a
    public Object b(a0 a0Var, e<? super Boolean> eVar) {
        return this.userRepository.b(a0Var, eVar);
    }
}
