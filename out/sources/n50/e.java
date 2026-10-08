package n50;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0003J\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Ln50/e;", "", "Loq/i0;", "a", "(Lm2/r;I)V", "Lkotlin/Function1;", "Ln50/e$a;", "Lf3/m;", "b", "()Ler/q;", "customContainerModifier", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {

    /* JADX INFO: renamed from: n50.e$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Ln50/e$a;", "", "Lcx/a;", "eventThrottler", "Lb1/l;", "interactionSource", "Lkotlin/Function0;", "Loq/i0;", "onClick", "<init>", "(Lcx/a;Lb1/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcx/a;", "()Lcx/a;", "b", "Lb1/l;", "()Lb1/l;", "c", "Ler/a;", "()Ler/a;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CustomContainerModifierData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final cx.a eventThrottler;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b1.l interactionSource;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onClick;

        public CustomContainerModifierData(cx.a aVar, b1.l lVar, er.a<oq.i0> aVar2) {
            this.eventThrottler = aVar;
            this.interactionSource = lVar;
            this.onClick = aVar2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final cx.a getEventThrottler() {
            return this.eventThrottler;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b1.l getInteractionSource() {
            return this.interactionSource;
        }

        public final er.a<oq.i0> c() {
            return this.onClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomContainerModifierData)) {
                return false;
            }
            CustomContainerModifierData customContainerModifierData = (CustomContainerModifierData) other;
            return fr.t.c(this.eventThrottler, customContainerModifierData.eventThrottler) && fr.t.c(this.interactionSource, customContainerModifierData.interactionSource) && fr.t.c(this.onClick, customContainerModifierData.onClick);
        }

        public int hashCode() {
            return (((this.eventThrottler.hashCode() * 31) + this.interactionSource.hashCode()) * 31) + this.onClick.hashCode();
        }

        public String toString() {
            return "CustomContainerModifierData(eventThrottler=" + this.eventThrottler + ", interactionSource=" + this.interactionSource + ", onClick=" + this.onClick + ')';
        }
    }

    void a(p076m2.r rVar, int i15);

    default er.q<CustomContainerModifierData, p076m2.r, Integer, f3.m> b() {
        return null;
    }
}
