package p036e4;

import er.p;
import fr.k;
import fr.w;
import m3.e;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\rB%\b\u0002\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ'\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0010¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Le4/r;", "Le4/i2;", "Lkotlin/Function2;", "Le4/a2$a;", "", "calculation", "<init>", "(Ler/p;)V", "()V", "coordinate", "Le4/b0;", "sourceCoordinates", "targetCoordinates", "a", "(FLe4/b0;Le4/b0;)F", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r extends i2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e4.r$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Le4/r$a;", "", "<init>", "()V", "", "Le4/r;", "rulers", "a", "([Le4/r;)Le4/r;", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: e4.r$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le4/a2$a;", "", "defaultValue", "c", "(Le4/a2$a;F)Ljava/lang/Float;"}, k = 3, mv = {2, 1, 0})
        static final class C1087a extends w implements p<a2.a, Float, Float> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r[] f47407b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1087a(r[] rVarArr) {
                super(2);
                this.f47407b = rVarArr;
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Float B(a2.a aVar, Float f15) {
                return c(aVar, f15.floatValue());
            }

            public final Float c(a2.a aVar, float f15) {
                return Float.valueOf(j2.b(aVar, true, this.f47407b, f15));
            }
        }

        /* JADX INFO: renamed from: e4.r$a$b */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le4/a2$a;", "", "defaultValue", "c", "(Le4/a2$a;F)Ljava/lang/Float;"}, k = 3, mv = {2, 1, 0})
        static final class b extends w implements p<a2.a, Float, Float> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r[] f47408b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(r[] rVarArr) {
                super(2);
                this.f47408b = rVarArr;
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Float B(a2.a aVar, Float f15) {
                return c(aVar, f15.floatValue());
            }

            public final Float c(a2.a aVar, float f15) {
                return Float.valueOf(j2.b(aVar, false, this.f47408b, f15));
            }
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final r a(r... rulers) {
            return new r(new C1087a(rulers), null);
        }

        public final r b(r... rulers) {
            return new r(new b(rulers), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ r(p pVar, k kVar) {
        this(pVar);
    }

    @Override // p036e4.i2
    public float a(float coordinate, b0 sourceCoordinates, b0 targetCoordinates) {
        return Float.intBitsToFloat((int) (targetCoordinates.r(sourceCoordinates, e.e((((long) Float.floatToRawIntBits(((int) (sourceCoordinates.b() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(coordinate)) & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax));
    }

    private r(p<? super a2.a, ? super Float, Float> pVar) {
        super(pVar, null);
    }

    public r() {
        this(null);
    }
}
