package p144z20;

import er.p;
import f1.q;
import f1.y0;
import java.util.Iterator;
import lr.m;
import lu.g;
import lu.j;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.x2;
import p076m2.x3;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R/\u0010\u001e\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001b\"\u0004\b\u001c\u0010\u001dR/\u0010\"\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u0019\u0010\u001f\"\u0004\b \u0010!R+\u0010)\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020#8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b\u0011\u0010&\"\u0004\b'\u0010(R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020#0*8\u0006¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b$\u0010,¨\u0006."}, d2 = {"Lz20/c;", "", "Lf1/y0;", "lazyListState", "Lkotlin/Function2;", "", "Loq/i0;", "onMove", "<init>", "(Lf1/y0;Ler/p;)V", "Lm3/e;", "offset", "h", "(J)V", "g", "()V", "f", "a", "Lf1/y0;", "d", "()Lf1/y0;", "b", "Ler/p;", "Lf1/q;", "<set-?>", "c", "Lm2/a3;", "()Lf1/q;", "j", "(Lf1/q;)V", "draggingItem", "()Ljava/lang/Integer;", "k", "(Ljava/lang/Integer;)V", "draggingItemIndex", "", "e", "Lm2/x2;", "()F", "i", "(F)V", "delta", "Llu/g;", "Llu/g;", "()Llu/g;", "scrollChannel", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f232335g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y0 lazyListState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p<Integer, Integer, i0> onMove;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a3 draggingItem = c6.e(null, null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a3 draggingItemIndex = c6.e(null, null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final x2 delta = x3.a(0.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final g<Float> scrollChannel = j.b(0, null, null, 7, null);

    /* JADX WARN: Multi-variable type inference failed */
    public c(y0 y0Var, p<? super Integer, ? super Integer, i0> pVar) {
        this.lazyListState = y0Var;
        this.onMove = pVar;
    }

    private final q b() {
        return (q) this.draggingItem.getValue();
    }

    private final void j(q qVar) {
        this.draggingItem.setValue(qVar);
    }

    public final float a() {
        return this.delta.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Integer c() {
        return (Integer) this.draggingItemIndex.getValue();
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final y0 getLazyListState() {
        return this.lazyListState;
    }

    public final g<Float> e() {
        return this.scrollChannel;
    }

    public final void f(long offset) {
        Object next;
        float fD;
        i(a() + Float.intBitsToFloat((int) (offset & BodyPartID.bodyIdMax)));
        Integer numC = c();
        if (numC != null) {
            int iIntValue = numC.intValue();
            q qVarB = b();
            if (qVarB == null) {
                return;
            }
            float offset2 = qVarB.getOffset() + a();
            float offset3 = qVarB.getOffset() + qVarB.getSize() + a();
            float f15 = ((offset3 - offset2) / 2) + offset2;
            Iterator<T> it = this.lazyListState.C().j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                q qVar = (q) next;
                int offset4 = qVar.getOffset();
                int offset5 = qVar.getOffset() + qVar.getSize();
                int i15 = (int) f15;
                if (offset4 <= i15 && i15 <= offset5 && qVarB.getIndex() != qVar.getIndex() && (qVar.getOrg.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE java.lang.String() instanceof DraggableItem)) {
                    break;
                }
            }
            q qVar2 = (q) next;
            if (qVar2 != null) {
                int index = ((DraggableItem) qVar2.getOrg.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE java.lang.String()).getIndex();
                this.onMove.B(numC, Integer.valueOf(index));
                k(Integer.valueOf(index));
                i(a() + (qVarB.getOffset() - qVar2.getOffset()));
                j(qVar2);
                return;
            }
            float viewportStartOffset = offset2 - this.lazyListState.C().getViewportStartOffset();
            float viewportEndOffset = offset3 - this.lazyListState.C().getViewportEndOffset();
            if (viewportStartOffset < 0.0f) {
                fD = m.i(viewportStartOffset, 0.0f);
            } else {
                fD = viewportEndOffset > 0.0f ? m.d(viewportEndOffset, 0.0f) : 0.0f;
            }
            if (fD == 0.0f || iIntValue == 0 || iIntValue == this.lazyListState.C().getTotalItemsCount() - 1) {
                return;
            }
            this.scrollChannel.d(Float.valueOf(fD));
        }
    }

    public final void g() {
        j(null);
        k(null);
        i(0.0f);
    }

    public final void h(long offset) {
        Object next;
        Iterator<T> it = this.lazyListState.C().j().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            q qVar = (q) next;
            int offset2 = qVar.getOffset();
            int offset3 = qVar.getOffset() + qVar.getSize();
            int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & offset));
            if (offset2 <= iIntBitsToFloat && iIntBitsToFloat <= offset3) {
                break;
            }
        }
        q qVar2 = (q) next;
        if (qVar2 != null) {
            Object obj = qVar2.getOrg.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE java.lang.String();
            DraggableItem draggableItem = obj instanceof DraggableItem ? (DraggableItem) obj : null;
            if (draggableItem != null) {
                j(qVar2);
                k(Integer.valueOf(draggableItem.getIndex()));
            }
        }
    }

    public final void i(float f15) {
        this.delta.p(f15);
    }

    public final void k(Integer num) {
        this.draggingItemIndex.setValue(num);
    }
}
