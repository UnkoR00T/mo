package pl.gov.coi.mobywatel.technical.ct.data.crl;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import p071kotlin.Metadata;
import uu.m;
import xu.c;
import yu.d1;
import yu.h1;
import yu.m0;
import yu.r1;
import yu.u1;
import yu.z;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Lpl/gov/coi/mobywatel/technical/ct/data/crl/CachedCrlEntryDto;", "", "", "base64Crl", "", "expiresAtMillis", "<init>", "(Ljava/lang/String;J)V", "", "seen0", "Lyu/r1;", "serializationConstructorMarker", "(ILjava/lang/String;JLyu/r1;)V", "self", "Lxu/c;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Loq/i0;", "write$Self$ct_release", "(Lpl/gov/coi/mobywatel/technical/ct/data/crl/CachedCrlEntryDto;Lxu/c;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()J", "copy", "(Ljava/lang/String;J)Lpl/gov/coi/mobywatel/technical/ct/data/crl/CachedCrlEntryDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBase64Crl", "J", "getExpiresAtMillis", "Companion", "a", "b", "ct_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@m
public final /* data */ class CachedCrlEntryDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String base64Crl;
    private final long expiresAtMillis;

    @Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"pl/gov/coi/mobywatel/technical/ct/data/crl/CachedCrlEntryDto.$serializer", "Lyu/z;", "Lpl/gov/coi/mobywatel/technical/ct/data/crl/CachedCrlEntryDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Loq/i0;", "b", "(Lkotlinx/serialization/encoding/Encoder;Lpl/gov/coi/mobywatel/technical/ct/data/crl/CachedCrlEntryDto;)V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "ct_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @oq.a
    public static final /* synthetic */ class a implements z<CachedCrlEntryDto> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f159119a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f159119a = aVar;
            h1 h1Var = new h1("pl.gov.coi.mobywatel.technical.ct.data.crl.CachedCrlEntryDto", aVar, 2);
            h1Var.f("base64Crl", false);
            h1Var.f("expiresAtMillis", false);
            descriptor = h1Var;
        }

        private a() {
        }

        @Override // uu.o
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, CachedCrlEntryDto value) {
            SerialDescriptor serialDescriptor = descriptor;
            c cVarA = encoder.a(serialDescriptor);
            CachedCrlEntryDto.write$Self$ct_release(value, cVarA, serialDescriptor);
            cVarA.q(serialDescriptor);
        }

        @Override // yu.z
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{u1.f229515a, m0.f229472a};
        }

        @Override // kotlinx.serialization.KSerializer, uu.o
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // yu.z
        public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
            return super.typeParametersSerializers();
        }
    }

    /* JADX INFO: renamed from: pl.gov.coi.mobywatel.technical.ct.data.crl.CachedCrlEntryDto$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpl/gov/coi/mobywatel/technical/ct/data/crl/CachedCrlEntryDto$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lpl/gov/coi/mobywatel/technical/ct/data/crl/CachedCrlEntryDto;", "serializer", "()Lkotlinx/serialization/KSerializer;", "ct_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final KSerializer<CachedCrlEntryDto> serializer() {
            return a.f159119a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CachedCrlEntryDto(int i15, String str, long j15, r1 r1Var) {
        if (3 != (i15 & 3)) {
            d1.a(i15, 3, a.f159119a.getDescriptor());
        }
        this.base64Crl = str;
        this.expiresAtMillis = j15;
    }

    public static /* synthetic */ CachedCrlEntryDto copy$default(CachedCrlEntryDto cachedCrlEntryDto, String str, long j15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = cachedCrlEntryDto.base64Crl;
        }
        if ((i15 & 2) != 0) {
            j15 = cachedCrlEntryDto.expiresAtMillis;
        }
        return cachedCrlEntryDto.copy(str, j15);
    }

    public static final /* synthetic */ void write$Self$ct_release(CachedCrlEntryDto self, c output, SerialDescriptor serialDesc) {
        output.w(serialDesc, 0, self.base64Crl);
        output.E(serialDesc, 1, self.expiresAtMillis);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBase64Crl() {
        return this.base64Crl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getExpiresAtMillis() {
        return this.expiresAtMillis;
    }

    public final CachedCrlEntryDto copy(String base64Crl, long expiresAtMillis) {
        return new CachedCrlEntryDto(base64Crl, expiresAtMillis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CachedCrlEntryDto)) {
            return false;
        }
        CachedCrlEntryDto cachedCrlEntryDto = (CachedCrlEntryDto) other;
        return t.c(this.base64Crl, cachedCrlEntryDto.base64Crl) && this.expiresAtMillis == cachedCrlEntryDto.expiresAtMillis;
    }

    public final String getBase64Crl() {
        return this.base64Crl;
    }

    public final long getExpiresAtMillis() {
        return this.expiresAtMillis;
    }

    public int hashCode() {
        return (this.base64Crl.hashCode() * 31) + Long.hashCode(this.expiresAtMillis);
    }

    public String toString() {
        return "CachedCrlEntryDto(base64Crl=" + this.base64Crl + ", expiresAtMillis=" + this.expiresAtMillis + ')';
    }

    public CachedCrlEntryDto(String str, long j15) {
        this.base64Crl = str;
        this.expiresAtMillis = j15;
    }
}
