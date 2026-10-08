package n50;

import androidx.compose.ui.graphics.Color;
import mx.Label;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Ln50/w0;", "", "b", "a", "Ln50/w0$a;", "Ln50/w0$b;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface w0 {

    /* JADX INFO: renamed from: n50.w0$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ln50/w0$a;", "Ln50/w0;", "Lr50/a;", "statusBadgeData", "<init>", "(Lr50/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lr50/a;", "()Lr50/a;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StatusBadge implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final r50.a statusBadgeData;

        public StatusBadge(r50.a aVar) {
            this.statusBadgeData = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final r50.a getStatusBadgeData() {
            return this.statusBadgeData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StatusBadge) && fr.t.c(this.statusBadgeData, ((StatusBadge) other).statusBadgeData);
        }

        public int hashCode() {
            return this.statusBadgeData.hashCode();
        }

        public String toString() {
            return "StatusBadge(statusBadgeData=" + this.statusBadgeData + ')';
        }
    }

    /* JADX INFO: renamed from: n50.w0$b, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Ln50/w0$b;", "Ln50/w0;", "Lmx/a;", AnnotatedPrivateKey.LABEL, "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Color;", "labelColor", "<init>", "(Lmx/a;Ler/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "()Lmx/a;", "b", "Ler/p;", "()Ler/p;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StatusLabel implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label label;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.p<p076m2.r, Integer, Color> labelColor;

        /* JADX WARN: Multi-variable type inference failed */
        public StatusLabel(Label label, er.p<? super p076m2.r, ? super Integer, Color> pVar) {
            this.label = label;
            this.labelColor = pVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getLabel() {
            return this.label;
        }

        public final er.p<p076m2.r, Integer, Color> b() {
            return this.labelColor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StatusLabel)) {
                return false;
            }
            StatusLabel statusLabel = (StatusLabel) other;
            return fr.t.c(this.label, statusLabel.label) && fr.t.c(this.labelColor, statusLabel.labelColor);
        }

        public int hashCode() {
            return (this.label.hashCode() * 31) + this.labelColor.hashCode();
        }

        public String toString() {
            return "StatusLabel(label=" + this.label + ", labelColor=" + this.labelColor + ')';
        }
    }
}
