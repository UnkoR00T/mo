package f00;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0001\t¨\u0006\n"}, d2 = {"Lf00/t;", "", "Landroidx/compose/ui/window/l;", "dialogProperties", "<init>", "(Landroidx/compose/ui/window/l;)V", "a", "Landroidx/compose/ui/window/l;", "()Landroidx/compose/ui/window/l;", "Lf00/t$a;", "navigation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.window.l dialogProperties;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lf00/t$a;", "Lf00/t;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "navigation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f54568b = new a();

        private a() {
            super(new androidx.compose.ui.window.l(false, false, false, 7, null), null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 465678085;
        }

        public String toString() {
            return "Modal";
        }
    }

    public /* synthetic */ t(androidx.compose.ui.window.l lVar, fr.k kVar) {
        this(lVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final androidx.compose.ui.window.l getDialogProperties() {
        return this.dialogProperties;
    }

    private t(androidx.compose.ui.window.l lVar) {
        this.dialogProperties = lVar;
    }
}
