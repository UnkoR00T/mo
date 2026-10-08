package pl.gov.coi.mobywatel.feature.airquality.data.db;

import er.l;
import fr.k;
import fy0.CoordinatesEntity;
import fy0.MeasurementPointEntity;
import fy0.PlaceEntity;
import fy0.QualityEntity;
import java.util.List;
import mr.c;
import oa.e;
import oa.f;
import oa.u;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import ta.m;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\n\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\n\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lpl/gov/coi/mobywatel/feature/airquality/data/db/a;", "Ldy0/a;", "Loa/u;", "__db", "<init>", "(Loa/u;)V", "Loq/i0;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lfy0/b;", "b", "c", "Loa/u;", "Loa/f;", "Loa/f;", "__insertAdapterOfMeasurementPointEntity", "Ley0/a;", "Ley0/a;", "__offsetDateTimeConverter", "Ley0/b;", "d", "Ley0/b;", "__qualityRateConverter", "Loa/e;", "e", "Loa/e;", "__deleteAdapterOfMeasurementPointEntity", "f", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements dy0.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f158617g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u __db;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ey0.a __offsetDateTimeConverter = new ey0.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ey0.b __qualityRateConverter = new ey0.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f<MeasurementPointEntity> __insertAdapterOfMeasurementPointEntity = new C3932a();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final e<MeasurementPointEntity> __deleteAdapterOfMeasurementPointEntity = new b();

    /* JADX INFO: renamed from: pl.gov.coi.mobywatel.feature.airquality.data.db.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"pl/gov/coi/mobywatel/feature/airquality/data/db/a$a", "Loa/f;", "Lfy0/b;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "f", "(Lya/d;Lfy0/b;)V", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C3932a extends f<MeasurementPointEntity> {
        C3932a() {
        }

        @Override // oa.f
        protected String b() {
            return "INSERT OR REPLACE INTO `MeasurementPointEntity` (`id`,`timestamp`,`expirationTimestamp`,`latitude`,`longitude`,`name`,`street`,`postcode`,`city`,`rate`,`humidity`,`pressure`,`temperature`,`pm10value`,`pm25value`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // oa.f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void a(ya.d statement, MeasurementPointEntity entity) {
            statement.S0(1, entity.getId());
            statement.S0(2, a.this.__offsetDateTimeConverter.a(entity.getTimestamp()));
            statement.S0(3, a.this.__offsetDateTimeConverter.a(entity.getExpirationTimestamp()));
            CoordinatesEntity coordinates = entity.getCoordinates();
            statement.Q(4, coordinates.getLatitude());
            statement.Q(5, coordinates.getLongitude());
            PlaceEntity place = entity.getPlace();
            statement.S0(6, place.getName());
            String street = place.getStreet();
            if (street == null) {
                statement.i0(7);
            } else {
                statement.S0(7, street);
            }
            statement.S0(8, place.getPostcode());
            statement.S0(9, place.getCity());
            QualityEntity quality = entity.getQuality();
            statement.S0(10, a.this.__qualityRateConverter.a(quality.getRate()));
            Float humidity = quality.getHumidity();
            if (humidity == null) {
                statement.i0(11);
            } else {
                statement.Q(11, humidity.floatValue());
            }
            Float pressure = quality.getPressure();
            if (pressure == null) {
                statement.i0(12);
            } else {
                statement.Q(12, pressure.floatValue());
            }
            Float temperature = quality.getTemperature();
            if (temperature == null) {
                statement.i0(13);
            } else {
                statement.Q(13, temperature.floatValue());
            }
            Float pm10value = quality.getPm10value();
            if (pm10value == null) {
                statement.i0(14);
            } else {
                statement.Q(14, pm10value.floatValue());
            }
            Float pm25value = quality.getPm25value();
            if (pm25value == null) {
                statement.i0(15);
            } else {
                statement.Q(15, pm25value.floatValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"pl/gov/coi/mobywatel/feature/airquality/data/db/a$b", "Loa/e;", "Lfy0/b;", "", "b", "()Ljava/lang/String;", "Lya/d;", "statement", "entity", "Loq/i0;", "d", "(Lya/d;Lfy0/b;)V", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends e<MeasurementPointEntity> {
        b() {
        }

        @Override // oa.e
        protected String b() {
            return "DELETE FROM `MeasurementPointEntity` WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // oa.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(ya.d statement, MeasurementPointEntity entity) {
            statement.S0(1, entity.getId());
        }
    }

    /* JADX INFO: renamed from: pl.gov.coi.mobywatel.feature.airquality.data.db.a$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpl/gov/coi/mobywatel/feature/airquality/data/db/a$c;", "", "<init>", "()V", "", "Lmr/c;", "a", "()Ljava/util/List;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final List<c<?>> a() {
            return v.n();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f158624e;

        d(tq.e<? super d> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f158624e;
            if (i15 == 0) {
                oq.u.b(obj);
                a aVar = a.this;
                this.f158624e = 1;
                if (a.super.a(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return a.this.new d(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    public a(u uVar) {
        this.__db = uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(String str, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            dVarE4.Y3();
            return i0.f148189a;
        } finally {
            dVarE4.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasurementPointEntity k(String str, a aVar, ya.b bVar) {
        ya.d dVarE4 = bVar.e4(str);
        try {
            int iD = m.d(dVarE4, "id");
            int iD2 = m.d(dVarE4, "timestamp");
            int iD3 = m.d(dVarE4, "expirationTimestamp");
            int iD4 = m.d(dVarE4, "latitude");
            int iD5 = m.d(dVarE4, "longitude");
            int iD6 = m.d(dVarE4, "name");
            int iD7 = m.d(dVarE4, "street");
            int iD8 = m.d(dVarE4, "postcode");
            int iD9 = m.d(dVarE4, "city");
            int iD10 = m.d(dVarE4, "rate");
            int iD11 = m.d(dVarE4, "humidity");
            int iD12 = m.d(dVarE4, "pressure");
            int iD13 = m.d(dVarE4, "temperature");
            int iD14 = m.d(dVarE4, "pm10value");
            int iD15 = m.d(dVarE4, "pm25value");
            MeasurementPointEntity measurementPointEntity = null;
            if (dVarE4.Y3()) {
                measurementPointEntity = new MeasurementPointEntity(dVarE4.u3(iD), new CoordinatesEntity(dVarE4.getDouble(iD4), dVarE4.getDouble(iD5)), new PlaceEntity(dVarE4.u3(iD6), dVarE4.isNull(iD7) ? null : dVarE4.u3(iD7), dVarE4.u3(iD8), dVarE4.u3(iD9)), new QualityEntity(aVar.__qualityRateConverter.b(dVarE4.u3(iD10)), dVarE4.isNull(iD11) ? null : Float.valueOf((float) dVarE4.getDouble(iD11)), dVarE4.isNull(iD12) ? null : Float.valueOf((float) dVarE4.getDouble(iD12)), dVarE4.isNull(iD13) ? null : Float.valueOf((float) dVarE4.getDouble(iD13)), dVarE4.isNull(iD14) ? null : Float.valueOf((float) dVarE4.getDouble(iD14)), dVarE4.isNull(iD15) ? null : Float.valueOf((float) dVarE4.getDouble(iD15))), aVar.__offsetDateTimeConverter.b(dVarE4.u3(iD2)), aVar.__offsetDateTimeConverter.b(dVarE4.u3(iD3)));
            }
            return measurementPointEntity;
        } finally {
            dVarE4.close();
        }
    }

    @Override // dy0.a
    public Object a(tq.e<? super i0> eVar) {
        Object objD = ta.a.d(this.__db, new d(null), eVar);
        return objD == uq.b.e() ? objD : i0.f148189a;
    }

    @Override // dy0.a
    public Object b(tq.e<? super MeasurementPointEntity> eVar) {
        final String str = "SELECT * FROM MeasurementPointEntity LIMIT 1";
        return ta.a.e(this.__db, true, false, new l() { // from class: dy0.b
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.feature.airquality.data.db.a.k(str, this, (ya.b) obj);
            }
        }, eVar);
    }

    @Override // dy0.a
    public Object c(tq.e<? super i0> eVar) {
        final String str = "DELETE FROM MeasurementPointEntity";
        Object objE = ta.a.e(this.__db, false, true, new l() { // from class: dy0.c
            @Override // er.l
            public final Object b(Object obj) {
                return pl.gov.coi.mobywatel.feature.airquality.data.db.a.j(str, (ya.b) obj);
            }
        }, eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }
}
