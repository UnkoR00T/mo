package lb4;

import fr.q0;
import fr.t;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import mr.c;
import p071kotlin.Metadata;
import uu.k;
import uu.m;
import yu.e0;
import yu.h1;
import yu.u1;
import yu.z;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Llb4/a;", "", "Companion", "b", "c", "d", "a", "Llb4/a$b;", "Llb4/a$c;", "Llb4/a$d;", "error_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@m
public interface a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f117706a;

    /* JADX INFO: renamed from: lb4.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llb4/a$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Llb4/a;", "serializer", "()Lkotlinx/serialization/KSerializer;", "error_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f117706a = new Companion();

        private Companion() {
        }

        public final KSerializer<a> serializer() {
            return new k("pl.gov.coi.shared.segment.error.data.model.PayloadErrorDto", q0.c(a.class), new c[]{q0.c(NewPayloadErrorDto.class), q0.c(OldPayloadErrorDtoV1.class), q0.c(OldPayloadErrorDtoV2.class)}, new KSerializer[]{NewPayloadErrorDto.C2855a.f117712a, OldPayloadErrorDtoV1.C2857a.f117716a, OldPayloadErrorDtoV2.C2858a.f117722a}, new Annotation[0]);
        }
    }

    /* JADX INFO: renamed from: lb4.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002\u001c!BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u0013R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\u001d\u0012\u0004\b#\u0010 \u001a\u0004\b\"\u0010\u0013R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001d\u0012\u0004\b$\u0010 \u001a\u0004\b\u001c\u0010\u0013R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u0012\u0004\b&\u0010 \u001a\u0004\b%\u0010\u0013R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u001d\u0012\u0004\b'\u0010 \u001a\u0004\b!\u0010\u0013¨\u0006)"}, d2 = {"Llb4/a$b;", "Llb4/a;", "", "code", "message", "action", "title", "businessCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "self", "Lxu/c;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Loq/i0;", "f", "(Llb4/a$b;Lxu/c;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "getCode$annotations", "()V", "b", "d", "getMessage$annotations", "getAction$annotations", "e", "getTitle$annotations", "getBusinessCode$annotations", "Companion", "error_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @m
    public static final /* data */ class NewPayloadErrorDto implements a {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @vl.c("code")
        private final String code;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        @vl.c("message")
        private final String message;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @vl.c("action")
        private final String action;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @vl.c("title")
        private final String title;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @vl.c("businessCode")
        private final String businessCode;

        /* JADX INFO: renamed from: lb4.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"pl/gov/coi/shared/segment/error/data/model/PayloadErrorDto.NewPayloadErrorDto.$serializer", "Lyu/z;", "Llb4/a$b;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Loq/i0;", "b", "(Lkotlinx/serialization/encoding/Encoder;Llb4/a$b;)V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "error_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @oq.a
        public static final /* synthetic */ class C2855a implements z<NewPayloadErrorDto> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2855a f117712a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f117713b;
            private static final SerialDescriptor descriptor;

            static {
                C2855a c2855a = new C2855a();
                f117712a = c2855a;
                f117713b = 8;
                h1 h1Var = new h1("NewPayloadErrorDto", c2855a, 5);
                h1Var.f("code", true);
                h1Var.f("message", true);
                h1Var.f("action", true);
                h1Var.f("title", true);
                h1Var.f("businessCode", true);
                descriptor = h1Var;
            }

            private C2855a() {
            }

            @Override // uu.o
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(Encoder encoder, NewPayloadErrorDto value) {
                SerialDescriptor serialDescriptor = descriptor;
                xu.c cVarA = encoder.a(serialDescriptor);
                NewPayloadErrorDto.f(value, cVarA, serialDescriptor);
                cVarA.q(serialDescriptor);
            }

            @Override // yu.z
            public final KSerializer<?>[] childSerializers() {
                u1 u1Var = u1.f229515a;
                return new KSerializer[]{vu.a.u(u1Var), vu.a.u(u1Var), vu.a.u(u1Var), vu.a.u(u1Var), vu.a.u(u1Var)};
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

        /* JADX INFO: renamed from: lb4.a$b$b, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llb4/a$b$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Llb4/a$b;", "serializer", "()Lkotlinx/serialization/KSerializer;", "error_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            public final KSerializer<NewPayloadErrorDto> serializer() {
                return C2855a.f117712a;
            }

            private Companion() {
            }
        }

        public NewPayloadErrorDto() {
            this(null, null, null, null, null, 31, null);
        }

        public static final /* synthetic */ void f(NewPayloadErrorDto self, xu.c output, SerialDescriptor serialDesc) {
            if (output.y(serialDesc, 0) || self.code != null) {
                output.z(serialDesc, 0, u1.f229515a, self.code);
            }
            if (output.y(serialDesc, 1) || self.message != null) {
                output.z(serialDesc, 1, u1.f229515a, self.message);
            }
            if (output.y(serialDesc, 2) || self.action != null) {
                output.z(serialDesc, 2, u1.f229515a, self.action);
            }
            if (output.y(serialDesc, 3) || self.title != null) {
                output.z(serialDesc, 3, u1.f229515a, self.title);
            }
            if (!output.y(serialDesc, 4) && self.businessCode == null) {
                return;
            }
            output.z(serialDesc, 4, u1.f229515a, self.businessCode);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBusinessCode() {
            return this.businessCode;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NewPayloadErrorDto)) {
                return false;
            }
            NewPayloadErrorDto newPayloadErrorDto = (NewPayloadErrorDto) other;
            return t.c(this.code, newPayloadErrorDto.code) && t.c(this.message, newPayloadErrorDto.message) && t.c(this.action, newPayloadErrorDto.action) && t.c(this.title, newPayloadErrorDto.title) && t.c(this.businessCode, newPayloadErrorDto.businessCode);
        }

        public int hashCode() {
            String str = this.code;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.message;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.action;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.title;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.businessCode;
            return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "NewPayloadErrorDto(code=" + this.code + ", message=" + this.message + ", action=" + this.action + ", title=" + this.title + ", businessCode=" + this.businessCode + ')';
        }

        public NewPayloadErrorDto(String str, String str2, String str3, String str4, String str5) {
            this.code = str;
            this.message = str2;
            this.action = str3;
            this.title = str4;
            this.businessCode = str5;
        }

        public /* synthetic */ NewPayloadErrorDto(String str, String str2, String str3, String str4, String str5, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : str2, (i15 & 4) != 0 ? null : str3, (i15 & 8) != 0 ? null : str4, (i15 & 16) != 0 ? null : str5);
        }
    }

    /* JADX INFO: renamed from: lb4.a$c, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\u0019\u001bB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001f\u0012\u0004\b \u0010\u001e\u001a\u0004\b\u0019\u0010\u0011¨\u0006\""}, d2 = {"Llb4/a$c;", "Llb4/a;", "", "errorCode", "", "error", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "self", "Lxu/c;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Loq/i0;", "c", "(Llb4/a$c;Lxu/c;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "getErrorCode$annotations", "()V", "Ljava/lang/String;", "getError$annotations", "Companion", "error_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @m
    public static final /* data */ class OldPayloadErrorDtoV1 implements a {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @vl.c("errorCode")
        private final Integer errorCode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        @vl.c("error")
        private final String error;

        /* JADX INFO: renamed from: lb4.a$c$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"pl/gov/coi/shared/segment/error/data/model/PayloadErrorDto.OldPayloadErrorDtoV1.$serializer", "Lyu/z;", "Llb4/a$c;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Loq/i0;", "b", "(Lkotlinx/serialization/encoding/Encoder;Llb4/a$c;)V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "error_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @oq.a
        public static final /* synthetic */ class C2857a implements z<OldPayloadErrorDtoV1> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2857a f117716a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f117717b;
            private static final SerialDescriptor descriptor;

            static {
                C2857a c2857a = new C2857a();
                f117716a = c2857a;
                f117717b = 8;
                h1 h1Var = new h1("OldPayloadErrorDtoV1", c2857a, 2);
                h1Var.f("errorCode", true);
                h1Var.f("error", true);
                descriptor = h1Var;
            }

            private C2857a() {
            }

            @Override // uu.o
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(Encoder encoder, OldPayloadErrorDtoV1 value) {
                SerialDescriptor serialDescriptor = descriptor;
                xu.c cVarA = encoder.a(serialDescriptor);
                OldPayloadErrorDtoV1.c(value, cVarA, serialDescriptor);
                cVarA.q(serialDescriptor);
            }

            @Override // yu.z
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{vu.a.u(e0.f229430a), vu.a.u(u1.f229515a)};
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

        /* JADX INFO: renamed from: lb4.a$c$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llb4/a$c$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Llb4/a$c;", "serializer", "()Lkotlinx/serialization/KSerializer;", "error_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            public final KSerializer<OldPayloadErrorDtoV1> serializer() {
                return C2857a.f117716a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OldPayloadErrorDtoV1() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static final /* synthetic */ void c(OldPayloadErrorDtoV1 self, xu.c output, SerialDescriptor serialDesc) {
            if (output.y(serialDesc, 0) || self.errorCode != null) {
                output.z(serialDesc, 0, e0.f229430a, self.errorCode);
            }
            if (!output.y(serialDesc, 1) && self.error == null) {
                return;
            }
            output.z(serialDesc, 1, u1.f229515a, self.error);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getErrorCode() {
            return this.errorCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OldPayloadErrorDtoV1)) {
                return false;
            }
            OldPayloadErrorDtoV1 oldPayloadErrorDtoV1 = (OldPayloadErrorDtoV1) other;
            return t.c(this.errorCode, oldPayloadErrorDtoV1.errorCode) && t.c(this.error, oldPayloadErrorDtoV1.error);
        }

        public int hashCode() {
            Integer num = this.errorCode;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.error;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "OldPayloadErrorDtoV1(errorCode=" + this.errorCode + ", error=" + this.error + ')';
        }

        public OldPayloadErrorDtoV1(Integer num, String str) {
            this.errorCode = num;
            this.error = str;
        }

        public /* synthetic */ OldPayloadErrorDtoV1(Integer num, String str, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? null : num, (i15 & 2) != 0 ? null : str);
        }
    }

    /* JADX INFO: renamed from: lb4.a$d, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002\u001b B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b \u0010\u0013R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010!\u0012\u0004\b$\u0010\u001f\u001a\u0004\b#\u0010\u0013R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010!\u0012\u0004\b'\u0010\u001f\u001a\u0004\b&\u0010\u0013¨\u0006)"}, d2 = {"Llb4/a$d;", "Llb4/a;", "", "code", "", "description", "details", "source", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "self", "Lxu/c;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Loq/i0;", "c", "(Llb4/a$d;Lxu/c;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "getCode$annotations", "()V", "b", "Ljava/lang/String;", "getDescription$annotations", "getDetails", "getDetails$annotations", "d", "getSource", "getSource$annotations", "Companion", "error_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @m
    public static final /* data */ class OldPayloadErrorDtoV2 implements a {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @vl.c("code")
        private final Integer code;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        @vl.c("description")
        private final String description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @vl.c("details")
        private final String details;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @vl.c("source")
        private final String source;

        /* JADX INFO: renamed from: lb4.a$d$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"pl/gov/coi/shared/segment/error/data/model/PayloadErrorDto.OldPayloadErrorDtoV2.$serializer", "Lyu/z;", "Llb4/a$d;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Loq/i0;", "b", "(Lkotlinx/serialization/encoding/Encoder;Llb4/a$d;)V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "error_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @oq.a
        public static final /* synthetic */ class C2858a implements z<OldPayloadErrorDtoV2> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2858a f117722a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f117723b;
            private static final SerialDescriptor descriptor;

            static {
                C2858a c2858a = new C2858a();
                f117722a = c2858a;
                f117723b = 8;
                h1 h1Var = new h1("OldPayloadErrorDtoV2", c2858a, 4);
                h1Var.f("code", true);
                h1Var.f("description", true);
                h1Var.f("details", true);
                h1Var.f("source", true);
                descriptor = h1Var;
            }

            private C2858a() {
            }

            @Override // uu.o
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void serialize(Encoder encoder, OldPayloadErrorDtoV2 value) {
                SerialDescriptor serialDescriptor = descriptor;
                xu.c cVarA = encoder.a(serialDescriptor);
                OldPayloadErrorDtoV2.c(value, cVarA, serialDescriptor);
                cVarA.q(serialDescriptor);
            }

            @Override // yu.z
            public final KSerializer<?>[] childSerializers() {
                KSerializer<?> kSerializerU = vu.a.u(e0.f229430a);
                u1 u1Var = u1.f229515a;
                return new KSerializer[]{kSerializerU, vu.a.u(u1Var), vu.a.u(u1Var), vu.a.u(u1Var)};
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

        /* JADX INFO: renamed from: lb4.a$d$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llb4/a$d$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Llb4/a$d;", "serializer", "()Lkotlinx/serialization/KSerializer;", "error_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            public final KSerializer<OldPayloadErrorDtoV2> serializer() {
                return C2858a.f117722a;
            }

            private Companion() {
            }
        }

        public OldPayloadErrorDtoV2() {
            this(null, null, null, null, 15, null);
        }

        public static final /* synthetic */ void c(OldPayloadErrorDtoV2 self, xu.c output, SerialDescriptor serialDesc) {
            if (output.y(serialDesc, 0) || self.code != null) {
                output.z(serialDesc, 0, e0.f229430a, self.code);
            }
            if (output.y(serialDesc, 1) || self.description != null) {
                output.z(serialDesc, 1, u1.f229515a, self.description);
            }
            if (output.y(serialDesc, 2) || self.details != null) {
                output.z(serialDesc, 2, u1.f229515a, self.details);
            }
            if (!output.y(serialDesc, 3) && self.source == null) {
                return;
            }
            output.z(serialDesc, 3, u1.f229515a, self.source);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Integer getCode() {
            return this.code;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OldPayloadErrorDtoV2)) {
                return false;
            }
            OldPayloadErrorDtoV2 oldPayloadErrorDtoV2 = (OldPayloadErrorDtoV2) other;
            return t.c(this.code, oldPayloadErrorDtoV2.code) && t.c(this.description, oldPayloadErrorDtoV2.description) && t.c(this.details, oldPayloadErrorDtoV2.details) && t.c(this.source, oldPayloadErrorDtoV2.source);
        }

        public int hashCode() {
            Integer num = this.code;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.description;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.details;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.source;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "OldPayloadErrorDtoV2(code=" + this.code + ", description=" + this.description + ", details=" + this.details + ", source=" + this.source + ')';
        }

        public OldPayloadErrorDtoV2(Integer num, String str, String str2, String str3) {
            this.code = num;
            this.description = str;
            this.details = str2;
            this.source = str3;
        }

        public /* synthetic */ OldPayloadErrorDtoV2(Integer num, String str, String str2, String str3, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? null : num, (i15 & 2) != 0 ? null : str, (i15 & 4) != 0 ? null : str2, (i15 & 8) != 0 ? null : str3);
        }
    }
}
