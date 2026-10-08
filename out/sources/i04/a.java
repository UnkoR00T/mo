package i04;

import dx.b;
import dx.i;
import dx.j;
import e04.BiometricData;
import e04.e;
import ex.d;
import fr.t;
import iy.c0;
import java.util.concurrent.CancellationException;
import oq.p;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.technical.biometric.data.model.BiometricsDataDto;
import pl.gov.coi.mobywatel.technical.biometric.data.model.BiometricsInAppAuthStatusDto;
import px.f;
import xw.c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n*\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u0010\u001a\u00020\u000f*\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u00020\u000e*\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Li04/a;", "", "<init>", "()V", "Le04/c;", "Liy/a;", "base64Coder", "Lpl/gov/coi/mobywatel/technical/biometric/data/model/BiometricsDataDto;", "c", "(Le04/c;Liy/a;)Lpl/gov/coi/mobywatel/technical/biometric/data/model/BiometricsDataDto;", "Ldx/i;", "Ldx/b;", "a", "(Lpl/gov/coi/mobywatel/technical/biometric/data/model/BiometricsDataDto;Liy/a;)Ldx/i;", "Le04/d;", "Lpl/gov/coi/mobywatel/technical/biometric/data/model/BiometricsInAppAuthStatusDto;", "d", "(Le04/d;)Lpl/gov/coi/mobywatel/technical/biometric/data/model/BiometricsInAppAuthStatusDto;", "b", "(Lpl/gov/coi/mobywatel/technical/biometric/data/model/BiometricsInAppAuthStatusDto;)Le04/d;", "biometric_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f87819a = new a();

    /* JADX INFO: renamed from: i04.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C2065a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f87820a;

        static {
            int[] iArr = new int[BiometricsInAppAuthStatusDto.values().length];
            try {
                iArr[BiometricsInAppAuthStatusDto.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BiometricsInAppAuthStatusDto.BIOMETRICS_WITH_PIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BiometricsInAppAuthStatusDto.BIOMETRICS_WITHOUT_PIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f87820a = iArr;
        }
    }

    private a() {
    }

    public final i<b, BiometricData> a(BiometricsDataDto biometricsDataDto, iy.a aVar) {
        Object objB;
        j<b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    return new i.Right(new BiometricData(f87819a.b(biometricsDataDto.getBiometricsInAppAuthStatus()), c0.f((byte[]) new ex.a().a(iy.a.c(aVar, biometricsDataDto.getEncryptedPassword(), null, 2, null)))));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    public final e04.d b(BiometricsInAppAuthStatusDto biometricsInAppAuthStatusDto) {
        int i15 = C2065a.f87820a[biometricsInAppAuthStatusDto.ordinal()];
        if (i15 == 1) {
            return new e.a.App(false, 1, null);
        }
        if (i15 == 2) {
            return e.b.a.f46688a;
        }
        if (i15 == 3) {
            return e.b.C1057b.f46689a;
        }
        throw new p();
    }

    public final BiometricsDataDto c(BiometricData biometricData, iy.a aVar) {
        return new BiometricsDataDto(d(biometricData.getInAppStatus()), iy.a.e(aVar, biometricData.getEncryptedCredential().getData(), null, 2, null));
    }

    public final BiometricsInAppAuthStatusDto d(e04.d dVar) {
        if (dVar instanceof e.a.App) {
            return BiometricsInAppAuthStatusDto.DISABLED;
        }
        if (t.c(dVar, e.b.a.f46688a)) {
            return BiometricsInAppAuthStatusDto.BIOMETRICS_WITH_PIN;
        }
        if (t.c(dVar, e.b.C1057b.f46689a)) {
            return BiometricsInAppAuthStatusDto.BIOMETRICS_WITHOUT_PIN;
        }
        throw new p();
    }
}
