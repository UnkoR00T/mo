package qd3;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import dx.j;
import ex.d;
import fr.t;
import iy.b0;
import iy.c0;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import lr.m;
import oq.p;
import oq.r;
import oq.y;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.feature.vehiclecollision.data.model.CollisionDraftAddressDto;
import pl.gov.coi.mobywatel.feature.vehiclecollision.data.model.CollisionDraftCompanyOwnerDto;
import pl.gov.coi.mobywatel.feature.vehiclecollision.data.model.CollisionDraftDamageDto;
import pl.gov.coi.mobywatel.feature.vehiclecollision.data.model.CollisionDraftDescriptionDto;
import pl.gov.coi.mobywatel.feature.vehiclecollision.data.model.CollisionDraftInsuranceDto;
import pl.gov.coi.mobywatel.feature.vehiclecollision.data.model.CollisionDraftPersonalDataDto;
import pl.gov.coi.mobywatel.feature.vehiclecollision.data.model.CollisionDraftPhoneNumberDto;
import pl.gov.coi.mobywatel.feature.vehiclecollision.data.model.CollisionDraftPhotoDto;
import pl.gov.coi.mobywatel.feature.vehiclecollision.data.model.CollisionDraftPhysicalOwnerDto;
import pl.gov.coi.mobywatel.feature.vehiclecollision.data.model.CollisionDraftStatementImageDto;
import pl.gov.coi.mobywatel.feature.vehiclecollision.data.model.CollisionDraftStepDto;
import pl.gov.coi.mobywatel.feature.vehiclecollision.data.model.CollisionDraftVehicleDamageDto;
import pl.gov.coi.mobywatel.feature.vehiclecollision.data.model.CollisionDraftVehicleDamageTypeDto;
import pl.gov.coi.mobywatel.feature.vehiclecollision.data.model.CollisionDraftVehicleDto;
import pl.gov.coi.mobywatel.feature.vehiclecollision.data.model.CollisionDraftVehicleOwnerDetailsDto;
import pl.gov.coi.mobywatel.feature.vehiclecollision.data.model.CollisionDraftVehiclesPageDto;
import pl.gov.coi.mobywatel.feature.vehiclecollision.data.model.LocationDetailsDto;
import pl.gov.coi.mobywatel.feature.vehiclecollision.data.model.vehicle.VehicleCardOwnershipTypeDto;
import pl.gov.coi.mobywatel.feature.vehiclecollision.data.model.vehicle.VehicleTypeDto;
import pq.v;
import px.f;
import rd3.StoredFileDto;
import sv0.BEVehicleData;
import sv0.Insurance;
import sv0.StatementVehicleData;
import sv0.m0;
import sv0.v0;
import tv0.BEContactDetailsAddress;
import tv0.BEPersonalData;
import tv0.BEVehicleCollisionDescriptionConception;
import tv0.BEVehicleDamage;
import tv0.BEVehicleDataWithType;
import tv0.BEVehiclesPages;
import tv0.YourDetails;
import tv0.c;
import tv0.h;
import tv0.l;
import vy.Coordinates;
import wx.k;
import xw.PhoneNumber;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\f\u001a\u00020\u000b*\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u0006*\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0010\u001a\u00020\n*\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0014\u001a\u00020\u0013*\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0016\u001a\u00020\u0012*\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0011\u0010\"\u001a\u00020!*\u00020 ¢\u0006\u0004\b\"\u0010#\u001a\u0011\u0010&\u001a\u00020%*\u00020$¢\u0006\u0004\b&\u0010'\u001a\u0011\u0010*\u001a\u00020)*\u00020(¢\u0006\u0004\b*\u0010+\u001a\u0011\u0010.\u001a\u00020-*\u00020,¢\u0006\u0004\b.\u0010/\u001a\u0011\u00102\u001a\u000201*\u000200¢\u0006\u0004\b2\u00103\u001a\u0011\u00104\u001a\u00020,*\u00020-¢\u0006\u0004\b4\u00105\u001a\u0011\u00106\u001a\u000200*\u000201¢\u0006\u0004\b6\u00107\u001a\u0011\u0010:\u001a\u000209*\u000208¢\u0006\u0004\b:\u0010;\u001a\u0011\u0010<\u001a\u00020\u0018*\u00020\u0019¢\u0006\u0004\b<\u0010=\u001a\u0011\u0010>\u001a\u00020\u001c*\u00020\u001d¢\u0006\u0004\b>\u0010?\u001a\u0011\u0010@\u001a\u00020 *\u00020!¢\u0006\u0004\b@\u0010A\u001a\u0011\u0010D\u001a\u00020C*\u00020B¢\u0006\u0004\bD\u0010E\u001a\u0011\u0010F\u001a\u00020B*\u00020C¢\u0006\u0004\bF\u0010G\u001a\u0011\u0010H\u001a\u00020$*\u00020%¢\u0006\u0004\bH\u0010I\u001a\u0011\u0010L\u001a\u00020K*\u00020J¢\u0006\u0004\bL\u0010M\u001a\u0011\u0010P\u001a\u00020O*\u00020N¢\u0006\u0004\bP\u0010Q\u001a\u0011\u0010R\u001a\u00020J*\u00020K¢\u0006\u0004\bR\u0010S\u001a\u0011\u0010T\u001a\u00020N*\u00020O¢\u0006\u0004\bT\u0010U\u001a\u0011\u0010X\u001a\u00020W*\u00020V¢\u0006\u0004\bX\u0010Y\u001a\u0011\u0010Z\u001a\u00020V*\u00020W¢\u0006\u0004\bZ\u0010[\u001a\u0011\u0010\\\u001a\u00020(*\u00020)¢\u0006\u0004\b\\\u0010]\u001a\u0011\u0010^\u001a\u000208*\u000209¢\u0006\u0004\b^\u0010_\u001a\u0011\u0010b\u001a\u00020a*\u00020`¢\u0006\u0004\bb\u0010c\u001a\u0011\u0010d\u001a\u00020`*\u00020a¢\u0006\u0004\bd\u0010e¨\u0006f"}, d2 = {"Ltv0/b$a;", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPhotoDto;", "x", "(Ltv0/b$a;)Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPhotoDto;", "d", "(Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPhotoDto;)Ltv0/b$a;", "Ltv0/h;", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftDamageDto;", "s", "(Ltv0/h;)Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftDamageDto;", "Ltv0/j;", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftVehicleDamageDto;", "B", "(Ltv0/j;)Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftVehicleDamageDto;", "h", "(Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftDamageDto;)Ltv0/h;", "k", "(Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftVehicleDamageDto;)Ltv0/j;", "Ltv0/c;", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftStepDto;", "A", "(Ltv0/c;)Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftStepDto;", "e", "(Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftStepDto;)Ltv0/c;", "Ltv0/m$a;", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftVehiclesPageDto;", "E", "(Ltv0/m$a;)Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftVehiclesPageDto;", "Ltv0/k;", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftVehicleDto;", "C", "(Ltv0/k;)Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftVehicleDto;", "Ltv0/k$a;", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/vehicle/VehicleTypeDto;", i.f37087n, "(Ltv0/k$a;)Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/vehicle/VehicleTypeDto;", "Lsv0/r;", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftInsuranceDto;", "u", "(Lsv0/r;)Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftInsuranceDto;", "Ltv0/l;", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftVehicleOwnerDetailsDto;", ip.a.f96138c, "(Ltv0/l;)Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftVehicleOwnerDetailsDto;", "Ltv0/i;", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftDescriptionDto;", "t", "(Ltv0/i;)Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftDescriptionDto;", "Ltv0/i$a;", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/LocationDetailsDto;", "F", "(Ltv0/i$a;)Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/LocationDetailsDto;", "j", "(Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftDescriptionDto;)Ltv0/i;", "i", "(Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/LocationDetailsDto;)Ltv0/i$a;", "Ltv0/l$c$b;", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPhysicalOwnerDto$PersonDataDto;", "y", "(Ltv0/l$c$b;)Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPhysicalOwnerDto$PersonDataDto;", "p", "(Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftVehiclesPageDto;)Ltv0/m$a;", "m", "(Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftVehicleDto;)Ltv0/k;", "l", "(Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/vehicle/VehicleTypeDto;)Ltv0/k$a;", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/vehicle/VehicleCardOwnershipTypeDto;", "Lsv0/m0;", "c", "(Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/vehicle/VehicleCardOwnershipTypeDto;)Lsv0/m0;", "G", "(Lsv0/m0;)Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/vehicle/VehicleCardOwnershipTypeDto;", "a", "(Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftInsuranceDto;)Lsv0/r;", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPersonalDataDto;", "Ltv0/f;", "g", "(Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPersonalDataDto;)Ltv0/f;", "Ltv0/d;", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftAddressDto;", "r", "(Ltv0/d;)Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftAddressDto;", "v", "(Ltv0/f;)Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPersonalDataDto;", "f", "(Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftAddressDto;)Ltv0/d;", "Lxw/h;", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPhoneNumberDto;", "w", "(Lxw/h;)Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPhoneNumberDto;", "q", "(Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPhoneNumberDto;)Lxw/h;", "o", "(Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftVehicleOwnerDetailsDto;)Ltv0/l;", "n", "(Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPhysicalOwnerDto$PersonDataDto;)Ltv0/l$c$b;", "Lsv0/i0$a;", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftStatementImageDto;", "z", "(Lsv0/i0$a;)Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftStatementImageDto;", "b", "(Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftStatementImageDto;)Lsv0/i0$a;", "vehiclecollision_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: qd3.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C4159a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f166137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f166138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f166139c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f166140d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f166141e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f166142f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f166143g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f166144h;

        static {
            int[] iArr = new int[v0.values().length];
            try {
                iArr[v0.FRONT_DAMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v0.BACK_DAMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v0.TOP_DAMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[v0.LEFT_FRONT_DAMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[v0.RIGHT_FRONT_DAMAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[v0.LEFT_SIDE_DAMAGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[v0.RIGHT_SIDE_DAMAGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[v0.LEFT_BACK_DAMAGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[v0.RIGHT_BACK_DAMAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[v0.UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f166137a = iArr;
            int[] iArr2 = new int[CollisionDraftVehicleDamageTypeDto.values().length];
            try {
                iArr2[CollisionDraftVehicleDamageTypeDto.FrontDamage.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CollisionDraftVehicleDamageTypeDto.BackDamage.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[CollisionDraftVehicleDamageTypeDto.TopDamage.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[CollisionDraftVehicleDamageTypeDto.LeftFrontDamage.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[CollisionDraftVehicleDamageTypeDto.RightFrontDamage.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[CollisionDraftVehicleDamageTypeDto.LeftSideDamage.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[CollisionDraftVehicleDamageTypeDto.RightSideDamage.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[CollisionDraftVehicleDamageTypeDto.LeftBackDamage.ordinal()] = 8;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[CollisionDraftVehicleDamageTypeDto.RightBackDamage.ordinal()] = 9;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[CollisionDraftVehicleDamageTypeDto.Unknown.ordinal()] = 10;
            } catch (NoSuchFieldError unused20) {
            }
            f166138b = iArr2;
            int[] iArr3 = new int[c.values().length];
            try {
                iArr3[c.VehicleList.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[c.VehicleOwnership.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[c.Insurances.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[c.Damage.ordinal()] = 4;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[c.DamageDetails.ordinal()] = 5;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[c.ContactDetails.ordinal()] = 6;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[c.Photos.ordinal()] = 7;
            } catch (NoSuchFieldError unused27) {
            }
            f166139c = iArr3;
            int[] iArr4 = new int[CollisionDraftStepDto.values().length];
            try {
                iArr4[CollisionDraftStepDto.VehicleList.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr4[CollisionDraftStepDto.VehicleOwnership.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr4[CollisionDraftStepDto.Insurances.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr4[CollisionDraftStepDto.Damage.ordinal()] = 4;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr4[CollisionDraftStepDto.DamageDetails.ordinal()] = 5;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr4[CollisionDraftStepDto.ContactDetails.ordinal()] = 6;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr4[CollisionDraftStepDto.Photos.ordinal()] = 7;
            } catch (NoSuchFieldError unused34) {
            }
            f166140d = iArr4;
            int[] iArr5 = new int[BEVehicleDataWithType.a.values().length];
            try {
                iArr5[BEVehicleDataWithType.a.Ambulance.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr5[BEVehicleDataWithType.a.Bus.ordinal()] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr5[BEVehicleDataWithType.a.Motorcycle.ordinal()] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr5[BEVehicleDataWithType.a.StandardCar.ordinal()] = 4;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr5[BEVehicleDataWithType.a.Tractor.ordinal()] = 5;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr5[BEVehicleDataWithType.a.Trailer.ordinal()] = 6;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr5[BEVehicleDataWithType.a.Truck.ordinal()] = 7;
            } catch (NoSuchFieldError unused41) {
            }
            f166141e = iArr5;
            int[] iArr6 = new int[VehicleTypeDto.values().length];
            try {
                iArr6[VehicleTypeDto.Ambulance.ordinal()] = 1;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr6[VehicleTypeDto.Bus.ordinal()] = 2;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr6[VehicleTypeDto.Motorcycle.ordinal()] = 3;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr6[VehicleTypeDto.StandardCar.ordinal()] = 4;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr6[VehicleTypeDto.Tractor.ordinal()] = 5;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr6[VehicleTypeDto.Trailer.ordinal()] = 6;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr6[VehicleTypeDto.Truck.ordinal()] = 7;
            } catch (NoSuchFieldError unused48) {
            }
            f166142f = iArr6;
            int[] iArr7 = new int[VehicleCardOwnershipTypeDto.values().length];
            try {
                iArr7[VehicleCardOwnershipTypeDto.OWNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr7[VehicleCardOwnershipTypeDto.CO_OWNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr7[VehicleCardOwnershipTypeDto.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused51) {
            }
            f166143g = iArr7;
            int[] iArr8 = new int[m0.values().length];
            try {
                iArr8[m0.OWNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr8[m0.CO_OWNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr8[m0.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused54) {
            }
            f166144h = iArr8;
        }
    }

    public static final CollisionDraftStepDto A(c cVar) {
        switch (C4159a.f166139c[cVar.ordinal()]) {
            case 1:
                return CollisionDraftStepDto.VehicleList;
            case 2:
                return CollisionDraftStepDto.VehicleOwnership;
            case 3:
                return CollisionDraftStepDto.Insurances;
            case 4:
                return CollisionDraftStepDto.Damage;
            case 5:
                return CollisionDraftStepDto.DamageDetails;
            case 6:
                return CollisionDraftStepDto.ContactDetails;
            case 7:
                return CollisionDraftStepDto.Photos;
            default:
                throw new p();
        }
    }

    public static final CollisionDraftVehicleDamageDto B(BEVehicleDamage bEVehicleDamage) {
        CollisionDraftVehicleDamageTypeDto collisionDraftVehicleDamageTypeDto;
        Set<v0> setA = bEVehicleDamage.a();
        ArrayList arrayList = new ArrayList(v.y(setA, 10));
        Iterator<T> it = setA.iterator();
        while (it.hasNext()) {
            switch (C4159a.f166137a[((v0) it.next()).ordinal()]) {
                case 1:
                    collisionDraftVehicleDamageTypeDto = CollisionDraftVehicleDamageTypeDto.FrontDamage;
                    break;
                case 2:
                    collisionDraftVehicleDamageTypeDto = CollisionDraftVehicleDamageTypeDto.BackDamage;
                    break;
                case 3:
                    collisionDraftVehicleDamageTypeDto = CollisionDraftVehicleDamageTypeDto.TopDamage;
                    break;
                case 4:
                    collisionDraftVehicleDamageTypeDto = CollisionDraftVehicleDamageTypeDto.LeftFrontDamage;
                    break;
                case 5:
                    collisionDraftVehicleDamageTypeDto = CollisionDraftVehicleDamageTypeDto.RightFrontDamage;
                    break;
                case 6:
                    collisionDraftVehicleDamageTypeDto = CollisionDraftVehicleDamageTypeDto.LeftSideDamage;
                    break;
                case 7:
                    collisionDraftVehicleDamageTypeDto = CollisionDraftVehicleDamageTypeDto.RightSideDamage;
                    break;
                case 8:
                    collisionDraftVehicleDamageTypeDto = CollisionDraftVehicleDamageTypeDto.LeftBackDamage;
                    break;
                case 9:
                    collisionDraftVehicleDamageTypeDto = CollisionDraftVehicleDamageTypeDto.RightBackDamage;
                    break;
                case 10:
                    collisionDraftVehicleDamageTypeDto = CollisionDraftVehicleDamageTypeDto.Unknown;
                    break;
                default:
                    throw new p();
            }
            arrayList.add(collisionDraftVehicleDamageTypeDto);
        }
        return new CollisionDraftVehicleDamageDto(v.k1(arrayList));
    }

    public static final CollisionDraftVehicleDto C(BEVehicleDataWithType bEVehicleDataWithType) {
        String kind = bEVehicleDataWithType.getVehicleData().getKind();
        String strE = c0.e(bEVehicleDataWithType.getVehicleData().getRegistrationNumber());
        String strE2 = c0.e(bEVehicleDataWithType.getVehicleData().getVin());
        String brand = bEVehicleDataWithType.getVehicleData().getBrand();
        String model = bEVehicleDataWithType.getVehicleData().getModel();
        String vehicleSignature = bEVehicleDataWithType.getVehicleData().getVehicleSignature();
        String productionYear = bEVehicleDataWithType.getVehicleData().getProductionYear();
        VehicleTypeDto vehicleTypeDtoH = H(bEVehicleDataWithType.getType());
        List<Insurance> listE = bEVehicleDataWithType.getVehicleData().e();
        ArrayList arrayList = new ArrayList(v.y(listE, 10));
        Iterator<T> it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(u((Insurance) it.next()));
        }
        return new CollisionDraftVehicleDto(kind, strE, strE2, brand, model, vehicleSignature, productionYear, vehicleTypeDtoH, arrayList, bEVehicleDataWithType.getVehicleData().getAddedManually(), G(bEVehicleDataWithType.getVehicleData().getVehicleCardOwnershipType()));
    }

    public static final CollisionDraftVehicleOwnerDetailsDto D(l lVar) {
        if (!(lVar instanceof l.PhysicalOwner)) {
            if (!(lVar instanceof l.CompanyOwner)) {
                throw new p();
            }
            l.CompanyOwner companyOwner = (l.CompanyOwner) lVar;
            return new CollisionDraftVehicleOwnerDetailsDto(null, new CollisionDraftCompanyOwnerDto(c0.e(companyOwner.getName()), w(companyOwner.getPhoneNumber()), c0.e(companyOwner.getEmail())));
        }
        Set<Map.Entry<l.PhysicalOwner.EnumC5029c, l.PhysicalOwner.PersonData>> setEntrySet = ((l.PhysicalOwner) lVar).c().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.e(pq.v0.e(v.y(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            r rVarA = y.a(Integer.valueOf(((l.PhysicalOwner.EnumC5029c) entry.getKey()).ordinal()), y((l.PhysicalOwner.PersonData) entry.getValue()));
            linkedHashMap.put(rVarA.c(), rVarA.d());
        }
        return new CollisionDraftVehicleOwnerDetailsDto(new CollisionDraftPhysicalOwnerDto(linkedHashMap), null);
    }

    public static final CollisionDraftVehiclesPageDto E(BEVehiclesPages.BEVehiclesPageWithTypes bEVehiclesPageWithTypes) {
        String key = bEVehiclesPageWithTypes.getKey();
        String nextPageKey = bEVehiclesPageWithTypes.getNextPageKey();
        List<BEVehicleDataWithType> listC = bEVehiclesPageWithTypes.c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(C((BEVehicleDataWithType) it.next()));
        }
        return new CollisionDraftVehiclesPageDto(key, nextPageKey, arrayList);
    }

    public static final LocationDetailsDto F(BEVehicleCollisionDescriptionConception.LocationDetails locationDetails) {
        return new LocationDetailsDto(locationDetails.getPlaceOfName().getText(), locationDetails.getStreetNameAndNumber().getText(), locationDetails.getCityName().getText(), locationDetails.getPostalCode().getText(), locationDetails.getVoivodeshipName().getText(), locationDetails.getCountry(), locationDetails.getCoordinates().getLatitude(), locationDetails.getCoordinates().getLongitude());
    }

    public static final VehicleCardOwnershipTypeDto G(m0 m0Var) {
        int i15 = C4159a.f166144h[m0Var.ordinal()];
        if (i15 == 1) {
            return VehicleCardOwnershipTypeDto.OWNER;
        }
        if (i15 == 2) {
            return VehicleCardOwnershipTypeDto.CO_OWNER;
        }
        if (i15 == 3) {
            return VehicleCardOwnershipTypeDto.NONE;
        }
        throw new p();
    }

    public static final VehicleTypeDto H(BEVehicleDataWithType.a aVar) {
        switch (C4159a.f166141e[aVar.ordinal()]) {
            case 1:
                return VehicleTypeDto.Ambulance;
            case 2:
                return VehicleTypeDto.Bus;
            case 3:
                return VehicleTypeDto.Motorcycle;
            case 4:
                return VehicleTypeDto.StandardCar;
            case 5:
                return VehicleTypeDto.Tractor;
            case 6:
                return VehicleTypeDto.Trailer;
            case 7:
                return VehicleTypeDto.Truck;
            default:
                throw new p();
        }
    }

    public static final Insurance a(CollisionDraftInsuranceDto collisionDraftInsuranceDto) {
        String insurerId = collisionDraftInsuranceDto.getInsurerId();
        String insurerName = collisionDraftInsuranceDto.getInsurerName();
        String insuranceNumber = collisionDraftInsuranceDto.getInsuranceNumber();
        return new Insurance(insurerId, insurerName, insuranceNumber != null ? c0.g(insuranceNumber) : null, collisionDraftInsuranceDto.getInsuranceAddedManually());
    }

    public static final StatementVehicleData.StatementImage b(CollisionDraftStatementImageDto collisionDraftStatementImageDto) {
        return new StatementVehicleData.StatementImage(b.b(collisionDraftStatementImageDto.getOriginal()), b.b(collisionDraftStatementImageDto.getThumbnail()));
    }

    public static final m0 c(VehicleCardOwnershipTypeDto vehicleCardOwnershipTypeDto) {
        int i15 = C4159a.f166143g[vehicleCardOwnershipTypeDto.ordinal()];
        if (i15 == 1) {
            return m0.OWNER;
        }
        if (i15 == 2) {
            return m0.CO_OWNER;
        }
        if (i15 == 3) {
            return m0.NONE;
        }
        throw new p();
    }

    public static final YourDetails.Photo d(CollisionDraftPhotoDto collisionDraftPhotoDto) {
        k kVarC = b.c(collisionDraftPhotoDto.getImage());
        if (!(kVarC instanceof k.Image)) {
            if (kVarC instanceof k.Regular) {
                return null;
            }
            throw new p();
        }
        k.Image image = (k.Image) kVarC;
        String originalName = collisionDraftPhotoDto.getOriginalName();
        String originalUri = collisionDraftPhotoDto.getOriginalUri();
        CollisionDraftStatementImageDto statementImage = collisionDraftPhotoDto.getStatementImage();
        return new YourDetails.Photo(image, originalName, originalUri, statementImage != null ? b(statementImage) : null);
    }

    public static final c e(CollisionDraftStepDto collisionDraftStepDto) {
        switch (C4159a.f166140d[collisionDraftStepDto.ordinal()]) {
            case 1:
                return c.VehicleList;
            case 2:
                return c.VehicleOwnership;
            case 3:
                return c.Insurances;
            case 4:
                return c.Damage;
            case 5:
                return c.DamageDetails;
            case 6:
                return c.ContactDetails;
            case 7:
                return c.Photos;
            default:
                throw new p();
        }
    }

    public static final BEContactDetailsAddress f(CollisionDraftAddressDto collisionDraftAddressDto) {
        b0 b0VarG = c0.g(collisionDraftAddressDto.getCity());
        b0 b0VarG2 = c0.g(collisionDraftAddressDto.getPostcode());
        b0 b0VarG3 = c0.g(collisionDraftAddressDto.getStreet());
        b0 b0VarG4 = c0.g(collisionDraftAddressDto.getBuildingNumber());
        String flatNumber = collisionDraftAddressDto.getFlatNumber();
        return new BEContactDetailsAddress(b0VarG, b0VarG2, b0VarG3, b0VarG4, flatNumber != null ? c0.g(flatNumber) : null);
    }

    public static final BEPersonalData g(CollisionDraftPersonalDataDto collisionDraftPersonalDataDto) {
        return new BEPersonalData(c0.g(collisionDraftPersonalDataDto.getFirstName()), c0.g(collisionDraftPersonalDataDto.getLastname()), q(collisionDraftPersonalDataDto.getPhoneNumber()), c0.g(collisionDraftPersonalDataDto.getEmail()), f(collisionDraftPersonalDataDto.getAddress()), true);
    }

    public static final h h(CollisionDraftDamageDto collisionDraftDamageDto) {
        boolean zIsDamaged = collisionDraftDamageDto.isDamaged();
        if (zIsDamaged) {
            CollisionDraftVehicleDamageDto damages = collisionDraftDamageDto.getDamages();
            return new h.Damaged(damages != null ? k(damages) : null);
        }
        if (zIsDamaged) {
            throw new p();
        }
        return h.b.f192400a;
    }

    public static final BEVehicleCollisionDescriptionConception.LocationDetails i(LocationDetailsDto locationDetailsDto) {
        return new BEVehicleCollisionDescriptionConception.LocationDetails(mx.b.b(locationDetailsDto.getPlaceOfName(), "placeOfName"), mx.b.b(locationDetailsDto.getStreetNameAndNumber(), "streetNameAndNumber"), mx.b.b(locationDetailsDto.getCityName(), "cityName"), mx.b.b(locationDetailsDto.getPostalCode(), "postalCode"), mx.b.b(locationDetailsDto.getVoivodeshipName(), "voivodeshipName"), locationDetailsDto.getCountry(), new Coordinates(locationDetailsDto.getLatitude(), locationDetailsDto.getLongitude()));
    }

    public static final BEVehicleCollisionDescriptionConception j(CollisionDraftDescriptionDto collisionDraftDescriptionDto) {
        fz.b.LocalDateTime localDateTime = new fz.b.LocalDateTime(collisionDraftDescriptionDto.getDate().toLocalDateTime());
        LocationDetailsDto address = collisionDraftDescriptionDto.getAddress();
        return new BEVehicleCollisionDescriptionConception(localDateTime, address != null ? i(address) : null, c0.g(collisionDraftDescriptionDto.getDescription()));
    }

    public static final BEVehicleDamage k(CollisionDraftVehicleDamageDto collisionDraftVehicleDamageDto) {
        v0 v0Var;
        Set<CollisionDraftVehicleDamageTypeDto> damagedComponents = collisionDraftVehicleDamageDto.getDamagedComponents();
        ArrayList arrayList = new ArrayList(v.y(damagedComponents, 10));
        Iterator<T> it = damagedComponents.iterator();
        while (it.hasNext()) {
            switch (C4159a.f166138b[((CollisionDraftVehicleDamageTypeDto) it.next()).ordinal()]) {
                case 1:
                    v0Var = v0.FRONT_DAMAGE;
                    break;
                case 2:
                    v0Var = v0.BACK_DAMAGE;
                    break;
                case 3:
                    v0Var = v0.TOP_DAMAGE;
                    break;
                case 4:
                    v0Var = v0.LEFT_FRONT_DAMAGE;
                    break;
                case 5:
                    v0Var = v0.RIGHT_FRONT_DAMAGE;
                    break;
                case 6:
                    v0Var = v0.LEFT_SIDE_DAMAGE;
                    break;
                case 7:
                    v0Var = v0.RIGHT_SIDE_DAMAGE;
                    break;
                case 8:
                    v0Var = v0.LEFT_BACK_DAMAGE;
                    break;
                case 9:
                    v0Var = v0.RIGHT_BACK_DAMAGE;
                    break;
                case 10:
                    v0Var = v0.UNKNOWN;
                    break;
                default:
                    throw new p();
            }
            arrayList.add(v0Var);
        }
        return new BEVehicleDamage(v.k1(arrayList));
    }

    public static final BEVehicleDataWithType.a l(VehicleTypeDto vehicleTypeDto) {
        switch (C4159a.f166142f[vehicleTypeDto.ordinal()]) {
            case 1:
                return BEVehicleDataWithType.a.Ambulance;
            case 2:
                return BEVehicleDataWithType.a.Bus;
            case 3:
                return BEVehicleDataWithType.a.Motorcycle;
            case 4:
                return BEVehicleDataWithType.a.StandardCar;
            case 5:
                return BEVehicleDataWithType.a.Tractor;
            case 6:
                return BEVehicleDataWithType.a.Trailer;
            case 7:
                return BEVehicleDataWithType.a.Truck;
            default:
                throw new p();
        }
    }

    public static final BEVehicleDataWithType m(CollisionDraftVehicleDto collisionDraftVehicleDto) {
        String kind = collisionDraftVehicleDto.getKind();
        b0 b0VarG = c0.g(collisionDraftVehicleDto.getRegistrationNumber());
        b0 b0VarG2 = c0.g(collisionDraftVehicleDto.getVin());
        String brand = collisionDraftVehicleDto.getBrand();
        String model = collisionDraftVehicleDto.getModel();
        String vehicleSignature = collisionDraftVehicleDto.getVehicleSignature();
        String productionYear = collisionDraftVehicleDto.getProductionYear();
        List<CollisionDraftInsuranceDto> insurances = collisionDraftVehicleDto.getInsurances();
        ArrayList arrayList = new ArrayList(v.y(insurances, 10));
        Iterator<T> it = insurances.iterator();
        while (it.hasNext()) {
            arrayList.add(a((CollisionDraftInsuranceDto) it.next()));
        }
        return new BEVehicleDataWithType(new BEVehicleData(kind, b0VarG, b0VarG2, brand, model, vehicleSignature, productionYear, arrayList, collisionDraftVehicleDto.getAddedManually(), c(collisionDraftVehicleDto.getVehicleCardOwnershipType())), l(collisionDraftVehicleDto.getType()));
    }

    public static final l.PhysicalOwner.PersonData n(CollisionDraftPhysicalOwnerDto.PersonDataDto personDataDto) {
        return new l.PhysicalOwner.PersonData(c0.g(personDataDto.getName()), c0.g(personDataDto.getSurname()), q(personDataDto.getPhoneNumber()), c0.g(personDataDto.getEmail()));
    }

    public static final l o(CollisionDraftVehicleOwnerDetailsDto collisionDraftVehicleOwnerDetailsDto) {
        dx.i left;
        Object objB;
        Object objB2;
        if (collisionDraftVehicleOwnerDetailsDto.getPhysicalOwner() == null) {
            return collisionDraftVehicleOwnerDetailsDto.getCompanyOwner() != null ? new l.CompanyOwner(c0.g(collisionDraftVehicleOwnerDetailsDto.getCompanyOwner().getName()), q(collisionDraftVehicleOwnerDetailsDto.getCompanyOwner().getPhoneNumber()), c0.g(collisionDraftVehicleOwnerDetailsDto.getCompanyOwner().getEmail())) : new l.PhysicalOwner(null, 1, null);
        }
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    Set<Map.Entry<Integer, CollisionDraftPhysicalOwnerDto.PersonDataDto>> setEntrySet = collisionDraftVehicleOwnerDetailsDto.getPhysicalOwner().getOwners().entrySet();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(m.e(pq.v0.e(v.y(setEntrySet, 10)), 16));
                    Iterator<T> it = setEntrySet.iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        l.PhysicalOwner.EnumC5029c enumC5029cA = l.PhysicalOwner.EnumC5029c.INSTANCE.a(((Number) entry.getKey()).intValue());
                        if (enumC5029cA == null) {
                            throw new NoSuchElementException("couldn't parse to PhysicalOwnerType enum");
                        }
                        r rVarA = y.a(enumC5029cA, n((CollisionDraftPhysicalOwnerDto.PersonDataDto) entry.getValue()));
                        linkedHashMap.put(rVarA.c(), rVarA.d());
                    }
                    left = new dx.i.Right(linkedHashMap);
                } catch (Exception e15) {
                    f fVar = f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    left = new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                left = new dx.i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
            if (left instanceof dx.i.Left) {
                objB2 = l.PhysicalOwner.INSTANCE.a();
            } else {
                if (!(left instanceof dx.i.Right)) {
                    throw new p();
                }
                objB2 = ((dx.i.Right) left).b();
            }
            return new l.PhysicalOwner((Map) objB2);
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final BEVehiclesPages.BEVehiclesPageWithTypes p(CollisionDraftVehiclesPageDto collisionDraftVehiclesPageDto) {
        String currentPage = collisionDraftVehiclesPageDto.getCurrentPage();
        String nextPageId = collisionDraftVehiclesPageDto.getNextPageId();
        List<CollisionDraftVehicleDto> list = collisionDraftVehiclesPageDto.getList();
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m((CollisionDraftVehicleDto) it.next()));
        }
        return new BEVehiclesPages.BEVehiclesPageWithTypes(currentPage, nextPageId, arrayList);
    }

    public static final PhoneNumber q(CollisionDraftPhoneNumberDto collisionDraftPhoneNumberDto) {
        return new PhoneNumber(PhoneNumber.c.c(c0.g(collisionDraftPhoneNumberDto.getPrefix())), PhoneNumber.b.c(c0.g(collisionDraftPhoneNumberDto.getNumber())), null);
    }

    public static final CollisionDraftAddressDto r(BEContactDetailsAddress bEContactDetailsAddress) {
        String strE = c0.e(bEContactDetailsAddress.getCity());
        String strE2 = c0.e(bEContactDetailsAddress.getPostcode());
        String strE3 = c0.e(bEContactDetailsAddress.getStreet());
        String strE4 = c0.e(bEContactDetailsAddress.getBuildingNumber());
        b0 flatNumber = bEContactDetailsAddress.getFlatNumber();
        return new CollisionDraftAddressDto(strE, strE2, strE3, strE4, flatNumber != null ? c0.e(flatNumber) : null);
    }

    public static final CollisionDraftDamageDto s(h hVar) {
        if (hVar instanceof h.Damaged) {
            BEVehicleDamage vehicleDamage = ((h.Damaged) hVar).getVehicleDamage();
            return new CollisionDraftDamageDto(true, vehicleDamage != null ? B(vehicleDamage) : null);
        }
        if (t.c(hVar, h.b.f192400a)) {
            return new CollisionDraftDamageDto(false, null);
        }
        throw new p();
    }

    public static final CollisionDraftDescriptionDto t(BEVehicleCollisionDescriptionConception bEVehicleCollisionDescriptionConception) {
        OffsetDateTime offsetDateTimeAtOffset = bEVehicleCollisionDescriptionConception.getDate().getDate().atOffset(ZoneOffset.UTC);
        BEVehicleCollisionDescriptionConception.LocationDetails address = bEVehicleCollisionDescriptionConception.getAddress();
        return new CollisionDraftDescriptionDto(offsetDateTimeAtOffset, address != null ? F(address) : null, c0.e(bEVehicleCollisionDescriptionConception.getDescription()));
    }

    public static final CollisionDraftInsuranceDto u(Insurance insurance) {
        String insurerId = insurance.getInsurerId();
        String insurerName = insurance.getInsurerName();
        b0 insuranceNumber = insurance.getInsuranceNumber();
        return new CollisionDraftInsuranceDto(insurerId, insurerName, insuranceNumber != null ? c0.e(insuranceNumber) : null, insurance.getInsuranceAddedManually());
    }

    public static final CollisionDraftPersonalDataDto v(BEPersonalData bEPersonalData) {
        return new CollisionDraftPersonalDataDto(c0.e(bEPersonalData.getFirstName()), c0.e(bEPersonalData.getLastname()), w(bEPersonalData.getPhoneNumber()), c0.e(bEPersonalData.getEmail()), r(bEPersonalData.getAddress()));
    }

    public static final CollisionDraftPhoneNumberDto w(PhoneNumber phoneNumber) {
        return new CollisionDraftPhoneNumberDto(c0.e(phoneNumber.h()), c0.e(phoneNumber.g()));
    }

    public static final CollisionDraftPhotoDto x(YourDetails.Photo photo) {
        StoredFileDto storedFileDtoF = b.f(photo.getImage());
        String originalLocalName = photo.getOriginalLocalName();
        String originalUri = photo.getOriginalUri();
        StatementVehicleData.StatementImage uploadedStatementImage = photo.getUploadedStatementImage();
        return new CollisionDraftPhotoDto(storedFileDtoF, originalLocalName, originalUri, uploadedStatementImage != null ? z(uploadedStatementImage) : null);
    }

    public static final CollisionDraftPhysicalOwnerDto.PersonDataDto y(l.PhysicalOwner.PersonData personData) {
        return new CollisionDraftPhysicalOwnerDto.PersonDataDto(c0.e(personData.getName()), c0.e(personData.getSurname()), w(personData.getPhoneNumber()), c0.e(personData.getEmail()));
    }

    public static final CollisionDraftStatementImageDto z(StatementVehicleData.StatementImage statementImage) {
        return new CollisionDraftStatementImageDto(b.h(statementImage.getOriginal()), b.h(statementImage.getThumbnail()));
    }
}
