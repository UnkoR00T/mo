package b52;

import er.l;
import fr.t;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.k;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import xw.f;
import zr0.BECommitmentType;
import zr0.BEStampDutyAmount;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lb52/b;", "Lxw/f;", "Lb52/b$a;", "Ln50/k;", "Lmx/c;", "labelProvider", "Ldz/a;", "currencyFormatter", "<init>", "(Lmx/c;Ldz/a;)V", "", "Lzr0/f;", "Lmx/a;", "e", "(Ljava/util/List;)Lmx/a;", "params", "f", "(Lb52/b$a;)Ln50/k;", "a", "Lmx/c;", "b", "Ldz/a;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dz.a currencyFormatter;

    /* JADX INFO: renamed from: b52.b$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lb52/b$a;", "", "Lzr0/a;", "commitmentType", "Lkotlin/Function1;", "Loq/i0;", "onTypeSelectedAction", "<init>", "(Lzr0/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzr0/a;", "()Lzr0/a;", "b", "Ler/l;", "()Ler/l;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BECommitmentType commitmentType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<BECommitmentType, i0> onTypeSelectedAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(BECommitmentType bECommitmentType, l<? super BECommitmentType, i0> lVar) {
            this.commitmentType = bECommitmentType;
            this.onTypeSelectedAction = lVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BECommitmentType getCommitmentType() {
            return this.commitmentType;
        }

        public final l<BECommitmentType, i0> b() {
            return this.onTypeSelectedAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.commitmentType, params.commitmentType) && t.c(this.onTypeSelectedAction, params.onTypeSelectedAction);
        }

        public int hashCode() {
            return (this.commitmentType.hashCode() * 31) + this.onTypeSelectedAction.hashCode();
        }

        public String toString() {
            return "Params(commitmentType=" + this.commitmentType + ", onTypeSelectedAction=" + this.onTypeSelectedAction + ')';
        }
    }

    public b(mx.c cVar, dz.a aVar) {
        this.labelProvider = cVar;
        this.currencyFormatter = aVar;
    }

    private final Label e(List<BEStampDutyAmount> list) {
        Label labelB;
        int size = list.size();
        if (size == 0) {
            labelB = Label.INSTANCE.b();
        } else if (size != 1) {
            mx.c cVar = this.labelProvider;
            int i15 = t32.b.f187479o0;
            dz.a aVar = this.currencyFormatter;
            Iterator<T> it = list.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            BigDecimal amount = ((BEStampDutyAmount) it.next()).getAmount();
            while (it.hasNext()) {
                BigDecimal amount2 = ((BEStampDutyAmount) it.next()).getAmount();
                if (amount.compareTo(amount2) > 0) {
                    amount = amount2;
                }
            }
            labelB = cVar.e(i15, aVar.b(amount, "PLN"));
        } else {
            labelB = mx.b.b(this.currencyFormatter.b(((BEStampDutyAmount) v.l0(list)).getAmount(), "PLN"), "");
        }
        return labelB.n("commitmentTypeAmount");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params) {
        params.b().b(params.getCommitmentType());
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public k b(final Params params) {
        return new DefaultSingleCardData(null, new er.a() { // from class: b52.a
            @Override // er.a
            public final Object a() {
                return b.h(params);
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(params.getCommitmentType().getName(), "commitmentTypeTitle"), null, null, 0, 0, null, 62, null)), new SingleCardLabel(e(params.getCommitmentType().c()), null, null, 0, 0, null, 62, null), 1, null), null, x0.Icon.INSTANCE.b(), null, 2813, null);
    }
}
