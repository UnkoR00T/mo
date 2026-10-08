package j3;

import er.l;
import g4.p1;
import g4.q1;
import g4.r1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p036e4.b0;
import p036e4.c0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\u0011\u001a\u00020\u0003\"\b\b\u0000\u0010\r*\u00020\f*\u00028\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lj3/g;", "Lj3/c;", "event", "Loq/i0;", "e", "(Lj3/g;Lj3/c;)V", "Lj3/e;", "Lm3/e;", "positionInRoot", "", "d", "(Lj3/e;J)Z", "Lg4/q1;", "T", "Lkotlin/Function1;", "Lg4/p1;", "block", "f", "(Lg4/q1;Ler/l;)V", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(e eVar, long j15) {
        if (!eVar.getNode().getIsAttached()) {
            return false;
        }
        b0 b0VarM = g4.h.s(eVar).m();
        if (!b0VarM.c()) {
            return false;
        }
        long jG = c0.g(b0VarM);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jG >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jG & BodyPartID.bodyIdMax));
        float fU3 = ((int) (eVar.getSize() >> 32)) + fIntBitsToFloat;
        float fU4 = ((int) (eVar.getSize() & BodyPartID.bodyIdMax)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j15 >> 32));
        if (fIntBitsToFloat <= fIntBitsToFloat3 && fIntBitsToFloat3 <= fU3) {
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax));
            if (fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= fU4) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(g gVar, c cVar) {
        gVar.o1(cVar);
        gVar.o0(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends q1> void f(T t15, l<? super T, ? extends p1> lVar) {
        if (lVar.b(t15) != p1.ContinueTraversal) {
            return;
        }
        r1.f(t15, lVar);
    }
}
