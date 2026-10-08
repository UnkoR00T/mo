package dy0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Ldy0/f;", "Lra/b;", "<init>", "()V", "Lya/b;", "connection", "Loq/i0;", "a", "(Lya/b;)V", "Lra/a;", "c", "Lra/a;", "callback", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f extends ra.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ra.a callback;

    public f() {
        super(1, 2);
        this.callback = new d();
    }

    @Override // ra.b
    public void a(ya.b connection) throws Exception {
        ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `_new_MeasurementPointEntity` (`id` TEXT NOT NULL, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `name` TEXT NOT NULL, `street` TEXT, `postcode` TEXT NOT NULL, `city` TEXT NOT NULL, `rate` TEXT NOT NULL, `humidity` REAL, `pressure` REAL, `temperature` REAL, `pm10value` REAL, `pm25value` REAL, PRIMARY KEY(`id`))");
        ya.a.a(connection, "INSERT INTO `_new_MeasurementPointEntity` (`id`,`latitude`,`longitude`,`name`,`street`,`postcode`,`city`,`rate`,`humidity`,`pressure`,`temperature`,`pm10value`,`pm25value`) SELECT `id`,`latitude`,`longitude`,`name`,`street`,`postcode`,`city`,`rate`,`humidity`,`pressure`,`temperature`,`pm10value`,`pm25value` FROM `MeasurementPointEntity`");
        ya.a.a(connection, "DROP TABLE `MeasurementPointEntity`");
        ya.a.a(connection, "ALTER TABLE `_new_MeasurementPointEntity` RENAME TO `MeasurementPointEntity`");
        this.callback.a(connection);
    }
}
