package pl.gov.coi.mobywatel.feature.airquality.data.db;

import android.content.Context;
import fr.k;
import oa.u;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lpl/gov/coi/mobywatel/feature/airquality/data/db/MeasurementPointsDatabase;", "Loa/u;", "<init>", "()V", "Ldy0/a;", "Z", "()Ldy0/a;", "dao", "o", "a", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MeasurementPointsDatabase extends u {

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f158613p = 8;

    /* JADX INFO: renamed from: pl.gov.coi.mobywatel.feature.airquality.data.db.MeasurementPointsDatabase$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lpl/gov/coi/mobywatel/feature/airquality/data/db/MeasurementPointsDatabase$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Loq/i0;", "a", "(Landroid/content/Context;)V", "", "MEASUREMENT_POINTS_DB", "Ljava/lang/String;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final void a(Context context) {
            context.deleteDatabase("measurement_points_db");
        }

        private Companion() {
        }
    }

    public abstract dy0.a Z();
}
