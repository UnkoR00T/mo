package yv1;

import er.l;
import fr.t;
import java.util.List;
import lv1.DynamicDocument;
import lz3.h;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lyv1/d;", "Lxw/f;", "Lyv1/d$a;", "", "Llv1/c;", "Ltv1/e;", "decoder", "<init>", "(Ltv1/e;)V", "input", "h", "(Lyv1/d$a;)Ljava/util/List;", "a", "Ltv1/e;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements xw.f<Input, List<? extends DynamicDocument>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final tv1.e decoder;

    /* JADX INFO: renamed from: yv1.d$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lyv1/d$a;", "", "Lrq0/b$b;", "type", "", "Llv1/c;", "list", "<init>", "(Lrq0/b$b;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrq0/b$b;", "b", "()Lrq0/b$b;", "Ljava/util/List;", "()Ljava/util/List;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Input {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b.EnumC4479b type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<DynamicDocument> list;

        public Input(rq0.b.EnumC4479b enumC4479b, List<DynamicDocument> list) {
            this.type = enumC4479b;
            this.list = list;
        }

        public final List<DynamicDocument> a() {
            return this.list;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final rq0.b.EnumC4479b getType() {
            return this.type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return this.type == input.type && t.c(this.list, input.list);
        }

        public int hashCode() {
            return (this.type.hashCode() * 31) + this.list.hashCode();
        }

        public String toString() {
            return "Input(type=" + this.type + ", list=" + this.list + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f229951a;

        static {
            int[] iArr = new int[rq0.b.EnumC4479b.values().length];
            try {
                iArr[rq0.b.EnumC4479b.JUNIOR_SCHOOL_CARD_MOBYWATEL_APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f229951a = iArr;
        }
    }

    public d(tv1.e eVar) {
        this.decoder = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable i(DynamicDocument dynamicDocument) {
        return Boolean.valueOf(dynamicDocument.d() == h.VALID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable l(d dVar, DynamicDocument dynamicDocument) {
        String strC = dVar.decoder.c(dynamicDocument.c());
        return strC == null ? "" : strC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable m(d dVar, DynamicDocument dynamicDocument) {
        String strB = dVar.decoder.b(dynamicDocument.c());
        return strB == null ? "" : strB;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public List<DynamicDocument> b(Input input) {
        return b.f229951a[input.getType().ordinal()] == 1 ? v.U0(input.a(), sq.a.c(new l() { // from class: yv1.a
            @Override // er.l
            public final Object b(Object obj) {
                return d.i((DynamicDocument) obj);
            }
        }, new l() { // from class: yv1.b
            @Override // er.l
            public final Object b(Object obj) {
                return d.l(this.f229946a, (DynamicDocument) obj);
            }
        }, new l() { // from class: yv1.c
            @Override // er.l
            public final Object b(Object obj) {
                return d.m(this.f229947a, (DynamicDocument) obj);
            }
        })) : input.a();
    }
}
