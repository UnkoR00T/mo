package ls3;

import fr.t;
import ks3.b;
import mx.Label;
import mx.c;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lls3/a;", "Lxw/f;", "Lls3/a$a;", "Lks3/b$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lls3/a$a;)Lks3/b$a;", "a", "Lmx/c;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, b.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: ls3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lls3/a$a;", "", "Lkotlin/Function0;", "Loq/i0;", "onApplicationTopicClick", "onOtherTopicClick", "<init>", "(Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onApplicationTopicClick;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onOtherTopicClick;

        public Params(er.a<i0> aVar, er.a<i0> aVar2) {
            this.onApplicationTopicClick = aVar;
            this.onOtherTopicClick = aVar2;
        }

        public final er.a<i0> a() {
            return this.onApplicationTopicClick;
        }

        public final er.a<i0> b() {
            return this.onOtherTopicClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.onApplicationTopicClick, params.onApplicationTopicClick) && t.c(this.onOtherTopicClick, params.onOtherTopicClick);
        }

        public int hashCode() {
            return (this.onApplicationTopicClick.hashCode() * 31) + this.onOtherTopicClick.hashCode();
        }

        public String toString() {
            return "Params(onApplicationTopicClick=" + this.onApplicationTopicClick + ", onOtherTopicClick=" + this.onOtherTopicClick + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public b.Data b(Params params) {
        Label labelC = this.labelProvider.c(ir3.a.R0);
        x0.Icon.Companion companion = x0.Icon.INSTANCE;
        x0.Icon iconB = companion.b();
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, params.a(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(ir3.a.N0), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(ir3.a.O0), null, null, 0, 0, null, 62, null), 1, null), null, iconB, null, 2813, null);
        x0.Icon iconB2 = companion.b();
        return new b.Data(labelC, defaultSingleCardData, new DefaultSingleCardData(null, params.b(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(ir3.a.P0), null, null, 0, 0, null, 62, null)), new SingleCardLabel(this.labelProvider.c(ir3.a.Q0), null, null, 0, 0, null, 62, null), 1, null), null, iconB2, null, 2813, null));
    }
}
