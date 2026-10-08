package mh3;

import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lmh3/e;", "Ll00/e;", "Lmh3/e$a;", "a", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lmh3/e$a;", "", "a", "Lmh3/e$a$a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: mh3.e$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u0019\u0010\u001f¨\u0006 "}, d2 = {"Lmh3/e$a$a;", "Lmh3/e$a;", "Li50/a;", "baseScaffoldData", "Lmx/a;", "header", "Ln50/k;", "noDamagesSingleCardData", "hasDamagesSingleCardData", "<init>", "(Li50/a;Lmx/a;Ln50/k;Ln50/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lmx/a;", "c", "()Lmx/a;", "Ln50/k;", "d", "()Ln50/k;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label header;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k noDamagesSingleCardData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k hasDamagesSingleCardData;

            public Initialized(BaseScaffoldData baseScaffoldData, Label label, n50.k kVar, n50.k kVar2) {
                this.baseScaffoldData = baseScaffoldData;
                this.header = label;
                this.noDamagesSingleCardData = kVar;
                this.hasDamagesSingleCardData = kVar2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final n50.k getHasDamagesSingleCardData() {
                return this.hasDamagesSingleCardData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getHeader() {
                return this.header;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final n50.k getNoDamagesSingleCardData() {
                return this.noDamagesSingleCardData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return t.c(this.baseScaffoldData, initialized.baseScaffoldData) && t.c(this.header, initialized.header) && t.c(this.noDamagesSingleCardData, initialized.noDamagesSingleCardData) && t.c(this.hasDamagesSingleCardData, initialized.hasDamagesSingleCardData);
            }

            public int hashCode() {
                return (((((this.baseScaffoldData.hashCode() * 31) + this.header.hashCode()) * 31) + this.noDamagesSingleCardData.hashCode()) * 31) + this.hasDamagesSingleCardData.hashCode();
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", header=" + this.header + ", noDamagesSingleCardData=" + this.noDamagesSingleCardData + ", hasDamagesSingleCardData=" + this.hasDamagesSingleCardData + ')';
            }
        }
    }
}
