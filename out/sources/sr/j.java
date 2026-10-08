package sr;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.asn1.eac.EACTags;
import org.conscrypt.metrics.ConscryptStatsLog;
import st.e1;
import st.f2;
import st.l2;
import st.p2;
import st.t0;
import st.u1;
import st.w0;
import st.x1;
import vr.a1;
import vr.b1;
import vr.i0;
import vr.o0;
import vr.v0;
import vr.y;
import vr.z0;
import yr.f0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final zs.f f183556g = zs.f.p("<built-ins module>");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f0 f183557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private rt.i<f0> f183558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rt.i<e> f183559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final rt.i<Collection<v0>> f183560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final rt.g<zs.f, vr.e> f183561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final rt.n f183562f;

    class a implements er.a<Collection<v0>> {
        a() {
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Collection<v0> a() {
            return Arrays.asList(j.this.s().V(p.B), j.this.s().V(p.D), j.this.s().V(p.E), j.this.s().V(p.C));
        }
    }

    class b implements er.a<e> {
        b() {
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e a() {
            EnumMap enumMap = new EnumMap(m.class);
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            for (m mVar : m.values()) {
                e1 e1VarR = j.this.r(mVar.p().e());
                e1 e1VarR2 = j.this.r(mVar.n().e());
                enumMap.put(mVar, e1VarR2);
                map.put(e1VarR, e1VarR2);
                map2.put(e1VarR2, e1VarR);
            }
            return new e(enumMap, map, map2, null);
        }
    }

    class c implements er.l<zs.f, vr.e> {
        c() {
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public vr.e b(zs.f fVar) {
            vr.h hVarE = j.this.t().e(fVar, ds.d.FROM_BUILTINS);
            if (hVarE == null) {
                throw new AssertionError("Built-in class " + p.B.b(fVar) + " is not found");
            }
            if (hVarE instanceof vr.e) {
                return (vr.e) hVarE;
            }
            throw new AssertionError("Must be a class descriptor " + fVar + ", but was " + hVarE);
        }
    }

    class d implements er.a<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f0 f183566a;

        d(f0 f0Var) {
            this.f183566a = f0Var;
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Void a() {
            if (j.this.f183557a == null) {
                j.this.f183557a = this.f183566a;
                return null;
            }
            throw new AssertionError("Built-ins module is already set: " + j.this.f183557a + " (attempting to reset to " + this.f183566a + ")");
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<m, e1> f183568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<t0, e1> f183569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map<e1, e1> f183570c;

        /* synthetic */ e(Map map, Map map2, Map map3, a aVar) {
            this(map, map2, map3);
        }

        private static /* synthetic */ void a(int i15) {
            Object[] objArr = new Object[3];
            if (i15 == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i15 != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private e(Map<m, e1> map, Map<t0, e1> map2, Map<e1, e1> map3) {
            if (map == null) {
                a(0);
            }
            if (map2 == null) {
                a(1);
            }
            if (map3 == null) {
                a(2);
            }
            this.f183568a = map;
            this.f183569b = map2;
            this.f183570c = map3;
        }
    }

    protected j(rt.n nVar) {
        if (nVar == null) {
            a(0);
        }
        this.f183562f = nVar;
        this.f183560d = nVar.d(new a());
        this.f183559c = nVar.d(new b());
        this.f183561e = nVar.i(new c());
    }

    public static boolean A0(t0 t0Var) {
        if (t0Var == null) {
            a(131);
        }
        return j0(t0Var, p.a.K0.i());
    }

    private static t0 B(t0 t0Var, i0 i0Var) {
        zs.b bVarN;
        zs.b bVarA;
        vr.e eVarB;
        if (t0Var == null) {
            a(71);
        }
        if (i0Var == null) {
            a(72);
        }
        vr.h hVarC = t0Var.T0().c();
        if (hVarC == null) {
            return null;
        }
        t tVar = t.f183699a;
        if (!tVar.b(hVarC.getName()) || (bVarN = ht.e.n(hVarC)) == null || (bVarA = tVar.a(bVarN)) == null || (eVarB = y.b(i0Var, bVarA)) == null) {
            return null;
        }
        return eVarB.t();
    }

    public static boolean B0(t0 t0Var) {
        if (t0Var == null) {
            a(129);
        }
        return j0(t0Var, p.a.I0.i());
    }

    public static boolean C0(vr.m mVar) {
        if (mVar == null) {
            a(10);
        }
        while (mVar != null) {
            if (mVar instanceof o0) {
                return ((o0) mVar).g().h(p.A);
            }
            mVar = mVar.b();
        }
        return false;
    }

    public static boolean D0(t0 t0Var) {
        if (t0Var == null) {
            a(142);
        }
        return n0(t0Var, p.a.f183639f);
    }

    public static boolean E0(t0 t0Var) {
        if (t0Var == null) {
            a(132);
        }
        return y0(t0Var) || B0(t0Var) || z0(t0Var) || A0(t0Var);
    }

    public static m O(t0 t0Var) {
        if (t0Var == null) {
            a(92);
        }
        vr.h hVarC = t0Var.T0().c();
        if (hVarC == null) {
            return null;
        }
        return Q(hVarC);
    }

    public static m Q(vr.m mVar) {
        if (mVar == null) {
            a(77);
        }
        if (p.a.T0.contains(mVar.getName())) {
            return p.a.V0.get(dt.i.m(mVar));
        }
        return null;
    }

    private vr.e R(m mVar) {
        if (mVar == null) {
            a(16);
        }
        return q(mVar.p().e());
    }

    public static m T(vr.m mVar) {
        if (mVar == null) {
            a(76);
        }
        if (p.a.S0.contains(mVar.getName())) {
            return p.a.U0.get(dt.i.m(mVar));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    private static /* synthetic */ void a(int i15) {
        String str;
        int i16;
        if (i15 != 11 && i15 != 13 && i15 != 15 && i15 != 69 && i15 != 74 && i15 != 81 && i15 != 84 && i15 != 86 && i15 != 87) {
            switch (i15) {
                default:
                    switch (i15) {
                        default:
                            switch (i15) {
                                default:
                                    switch (i15) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                                        case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 48:
                                case 49:
                                case 50:
                                case EACTags.TRANSACTION_DATE /* 51 */:
                                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                                case 53:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case BERTags.DATE /* 31 */:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                        case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                        case EACTags.INTERCHANGE_CONTROL /* 39 */:
                        case 40:
                        case EACTags.INTERCHANGE_PROFILE /* 41 */:
                        case EACTags.CURRENCY_CODE /* 42 */:
                        case EACTags.DATE_OF_BIRTH /* 43 */:
                        case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                        case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                        case 46:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i15 != 11 && i15 != 13 && i15 != 15 && i15 != 69 && i15 != 74 && i15 != 81 && i15 != 84 && i15 != 86 && i15 != 87) {
            switch (i15) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    i16 = 2;
                    break;
                default:
                    switch (i15) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case BERTags.DATE /* 31 */:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                        case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                        case EACTags.INTERCHANGE_CONTROL /* 39 */:
                        case 40:
                        case EACTags.INTERCHANGE_PROFILE /* 41 */:
                        case EACTags.CURRENCY_CODE /* 42 */:
                        case EACTags.DATE_OF_BIRTH /* 43 */:
                        case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                        case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                        case 46:
                            i16 = 2;
                            break;
                        default:
                            switch (i15) {
                                case 48:
                                case 49:
                                case 50:
                                case EACTags.TRANSACTION_DATE /* 51 */:
                                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                                case 53:
                                    i16 = 2;
                                    break;
                                default:
                                    switch (i15) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                                        case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                                            i16 = 2;
                                            break;
                                        default:
                                            i16 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i16 = 2;
        }
        Object[] objArr = new Object[i16];
        switch (i15) {
            case 1:
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case BERTags.DATE /* 31 */:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
            case 40:
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
            case EACTags.CURRENCY_CODE /* 42 */:
            case EACTags.DATE_OF_BIRTH /* 43 */:
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
            case 46:
            case 48:
            case 49:
            case 50:
            case EACTags.TRANSACTION_DATE /* 51 */:
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
            case 53:
            case 55:
            case 56:
            case 57:
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
            case EACTags.DISPLAY_IMAGE /* 69 */:
            case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
            case EACTags.ANSWER_TO_RESET /* 81 */:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
            case 89:
            case 96:
            case 103:
            case 107:
            case 108:
            case 143:
            case 146:
            case 147:
            case 149:
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_GCM_SHA384 /* 157 */:
            case 158:
            case 159:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case EACTags.CURRENCY_EXPONENT /* 54 */:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case CertificateBody.profileType /* 127 */:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_128_CBC_SHA /* 140 */:
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_256_CBC_SHA /* 141 */:
            case 142:
            case 144:
            case 145:
            case 148:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_GCM_SHA256 /* 156 */:
            case 161:
                objArr[0] = "type";
                break;
            case 47:
                objArr[0] = "classSimpleName";
                break;
            case EACTags.APPLICATION_IMAGE /* 68 */:
            case 70:
                objArr[0] = "arrayType";
                break;
            case EACTags.MESSAGE_REFERENCE /* 71 */:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case EACTags.DEPRECATED /* 75 */:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case EACTags.HISTORICAL_BYTES /* 82 */:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case EACTags.UNIFORM_RESOURCE_LOCATOR /* 80 */:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 160:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i15 == 11) {
            objArr[1] = "getBuiltInsPackageScope";
        } else if (i15 == 13) {
            objArr[1] = "getBuiltInClassByFqName";
        } else if (i15 == 15) {
            objArr[1] = "getBuiltInClassByName";
        } else if (i15 == 69) {
            objArr[1] = "getArrayElementType";
        } else if (i15 == 74) {
            objArr[1] = "getPrimitiveArrayKotlinType";
        } else if (i15 == 81 || i15 == 84) {
            objArr[1] = "getArrayType";
        } else if (i15 == 86) {
            objArr[1] = "getEnumType";
        } else if (i15 != 87) {
            switch (i15) {
                case 3:
                    objArr[1] = "getAdditionalClassPartsProvider";
                    break;
                case 4:
                    objArr[1] = "getPlatformDependentDeclarationFilter";
                    break;
                case 5:
                    objArr[1] = "getClassDescriptorFactories";
                    break;
                case 6:
                    objArr[1] = "getStorageManager";
                    break;
                case 7:
                    objArr[1] = "getBuiltInsModule";
                    break;
                case 8:
                    objArr[1] = "getBuiltInPackagesImportedByDefault";
                    break;
                default:
                    switch (i15) {
                        case 18:
                            objArr[1] = "getSuspendFunction";
                            break;
                        case 19:
                            objArr[1] = "getKFunction";
                            break;
                        case 20:
                            objArr[1] = "getKSuspendFunction";
                            break;
                        case 21:
                            objArr[1] = "getKClass";
                            break;
                        case 22:
                            objArr[1] = "getKType";
                            break;
                        case 23:
                            objArr[1] = "getKCallable";
                            break;
                        case 24:
                            objArr[1] = "getKProperty";
                            break;
                        case 25:
                            objArr[1] = "getKProperty0";
                            break;
                        case 26:
                            objArr[1] = "getKProperty1";
                            break;
                        case 27:
                            objArr[1] = "getKProperty2";
                            break;
                        case 28:
                            objArr[1] = "getKMutableProperty0";
                            break;
                        case 29:
                            objArr[1] = "getKMutableProperty1";
                            break;
                        case 30:
                            objArr[1] = "getKMutableProperty2";
                            break;
                        case BERTags.DATE /* 31 */:
                            objArr[1] = "getIterator";
                            break;
                        case 32:
                            objArr[1] = "getIterable";
                            break;
                        case 33:
                            objArr[1] = "getMutableIterable";
                            break;
                        case 34:
                            objArr[1] = "getMutableIterator";
                            break;
                        case 35:
                            objArr[1] = "getCollection";
                            break;
                        case 36:
                            objArr[1] = "getMutableCollection";
                            break;
                        case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                            objArr[1] = "getList";
                            break;
                        case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                            objArr[1] = "getMutableList";
                            break;
                        case EACTags.INTERCHANGE_CONTROL /* 39 */:
                            objArr[1] = "getSet";
                            break;
                        case 40:
                            objArr[1] = "getMutableSet";
                            break;
                        case EACTags.INTERCHANGE_PROFILE /* 41 */:
                            objArr[1] = "getMap";
                            break;
                        case EACTags.CURRENCY_CODE /* 42 */:
                            objArr[1] = "getMutableMap";
                            break;
                        case EACTags.DATE_OF_BIRTH /* 43 */:
                            objArr[1] = "getMapEntry";
                            break;
                        case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                            objArr[1] = "getMutableMapEntry";
                            break;
                        case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                            objArr[1] = "getListIterator";
                            break;
                        case 46:
                            objArr[1] = "getMutableListIterator";
                            break;
                        default:
                            switch (i15) {
                                case 48:
                                    objArr[1] = "getBuiltInTypeByClassName";
                                    break;
                                case 49:
                                    objArr[1] = "getNothingType";
                                    break;
                                case 50:
                                    objArr[1] = "getNullableNothingType";
                                    break;
                                case EACTags.TRANSACTION_DATE /* 51 */:
                                    objArr[1] = "getAnyType";
                                    break;
                                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                                    objArr[1] = "getNullableAnyType";
                                    break;
                                case 53:
                                    objArr[1] = "getDefaultBound";
                                    break;
                                default:
                                    switch (i15) {
                                        case 55:
                                            objArr[1] = "getPrimitiveKotlinType";
                                            break;
                                        case 56:
                                            objArr[1] = "getNumberType";
                                            break;
                                        case 57:
                                            objArr[1] = "getByteType";
                                            break;
                                        case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                                            objArr[1] = "getShortType";
                                            break;
                                        case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                                            objArr[1] = "getIntType";
                                            break;
                                        case 60:
                                            objArr[1] = "getLongType";
                                            break;
                                        case 61:
                                            objArr[1] = "getFloatType";
                                            break;
                                        case 62:
                                            objArr[1] = "getDoubleType";
                                            break;
                                        case 63:
                                            objArr[1] = "getCharType";
                                            break;
                                        case 64:
                                            objArr[1] = "getBooleanType";
                                            break;
                                        case 65:
                                            objArr[1] = "getUnitType";
                                            break;
                                        case 66:
                                            objArr[1] = "getStringType";
                                            break;
                                        case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                                            objArr[1] = "getIterableType";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "getAnnotationType";
        }
        switch (i15) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case BERTags.DATE /* 31 */:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
            case 40:
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
            case EACTags.CURRENCY_CODE /* 42 */:
            case EACTags.DATE_OF_BIRTH /* 43 */:
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
            case 46:
            case 48:
            case 49:
            case 50:
            case EACTags.TRANSACTION_DATE /* 51 */:
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
            case 53:
            case 55:
            case 56:
            case 57:
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
            case EACTags.DISPLAY_IMAGE /* 69 */:
            case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
            case EACTags.ANSWER_TO_RESET /* 81 */:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 47:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case EACTags.CURRENCY_EXPONENT /* 54 */:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                objArr[2] = "getArrayElementType";
                break;
            case 70:
                objArr[2] = "getArrayElementTypeOrNull";
                break;
            case EACTags.MESSAGE_REFERENCE /* 71 */:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case EACTags.DEPRECATED /* 75 */:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case EACTags.UNIFORM_RESOURCE_LOCATOR /* 80 */:
            case EACTags.HISTORICAL_BYTES /* 82 */:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case CertificateBody.profileType /* 127 */:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_128_CBC_SHA /* 140 */:
                objArr[2] = "isNullableAny";
                break;
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_256_CBC_SHA /* 141 */:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 144:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 145:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 146:
                objArr[2] = "isMemberOfAny";
                break;
            case 147:
            case 148:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 152:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 155:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_GCM_SHA256 /* 156 */:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_GCM_SHA384 /* 157 */:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isDeprecated";
                break;
            case 161:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i15 != 11 && i15 != 13 && i15 != 15 && i15 != 69 && i15 != 74 && i15 != 81 && i15 != 84 && i15 != 86 && i15 != 87) {
            switch (i15) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    switch (i15) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case BERTags.DATE /* 31 */:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                        case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                        case EACTags.INTERCHANGE_CONTROL /* 39 */:
                        case 40:
                        case EACTags.INTERCHANGE_PROFILE /* 41 */:
                        case EACTags.CURRENCY_CODE /* 42 */:
                        case EACTags.DATE_OF_BIRTH /* 43 */:
                        case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                        case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                        case 46:
                            break;
                        default:
                            switch (i15) {
                                case 48:
                                case 49:
                                case 50:
                                case EACTags.TRANSACTION_DATE /* 51 */:
                                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                                case 53:
                                    break;
                                default:
                                    switch (i15) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                                        case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b0(vr.e eVar) {
        if (eVar == null) {
            a(108);
        }
        return e(eVar, p.a.f183631b);
    }

    public static boolean c0(t0 t0Var) {
        if (t0Var == null) {
            a(139);
        }
        return i0(t0Var, p.a.f183631b);
    }

    public static boolean d0(t0 t0Var) {
        if (t0Var == null) {
            a(88);
        }
        return i0(t0Var, p.a.f183645i);
    }

    private static boolean e(vr.h hVar, zs.d dVar) {
        if (hVar == null) {
            a(103);
        }
        if (dVar == null) {
            a(104);
        }
        return hVar.getName().equals(dVar.j()) && dVar.equals(dt.i.m(hVar));
    }

    public static boolean e0(t0 t0Var) {
        if (t0Var == null) {
            a(90);
        }
        return d0(t0Var) || r0(t0Var);
    }

    public static boolean f0(vr.e eVar) {
        if (eVar == null) {
            a(89);
        }
        return e(eVar, p.a.f183645i) || Q(eVar) != null;
    }

    public static boolean g0(t0 t0Var) {
        if (t0Var == null) {
            a(110);
        }
        return j0(t0Var, p.a.f183647j);
    }

    public static boolean h0(vr.m mVar) {
        if (mVar == null) {
            a(9);
        }
        return dt.i.r(mVar, sr.c.class, false) != null;
    }

    private static boolean i0(t0 t0Var, zs.d dVar) {
        if (t0Var == null) {
            a(97);
        }
        if (dVar == null) {
            a(98);
        }
        return x0(t0Var.T0(), dVar);
    }

    private static boolean j0(t0 t0Var, zs.d dVar) {
        if (t0Var == null) {
            a(134);
        }
        if (dVar == null) {
            a(135);
        }
        return i0(t0Var, dVar) && !t0Var.U0();
    }

    public static boolean k0(t0 t0Var) {
        if (t0Var == null) {
            a(ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_256_CBC_SHA);
        }
        return q0(t0Var);
    }

    public static boolean l0(vr.m mVar) {
        if (mVar == null) {
            a(160);
        }
        if (mVar.Q0().getAnnotations().d2(p.a.f183677y)) {
            return true;
        }
        if (mVar instanceof z0) {
            z0 z0Var = (z0) mVar;
            boolean zQ = z0Var.Q();
            a1 a1VarD = z0Var.d();
            b1 b1VarJ = z0Var.j();
            if (a1VarD != null && l0(a1VarD) && (!zQ || (b1VarJ != null && l0(b1VarJ)))) {
                return true;
            }
        }
        return false;
    }

    public static boolean m0(vr.e eVar) {
        if (eVar == null) {
            a(158);
        }
        return e(eVar, p.a.f183652l0);
    }

    private static boolean n0(t0 t0Var, zs.d dVar) {
        if (t0Var == null) {
            a(105);
        }
        if (dVar == null) {
            a(106);
        }
        return !t0Var.U0() && i0(t0Var, dVar);
    }

    public static boolean o0(t0 t0Var) {
        if (t0Var == null) {
            a(136);
        }
        return p0(t0Var) && !l2.l(t0Var);
    }

    public static boolean p0(t0 t0Var) {
        if (t0Var == null) {
            a(138);
        }
        return i0(t0Var, p.a.f183633c);
    }

    private vr.e q(String str) {
        if (str == null) {
            a(14);
        }
        vr.e eVarB = this.f183561e.b(zs.f.l(str));
        if (eVarB == null) {
            a(15);
        }
        return eVarB;
    }

    public static boolean q0(t0 t0Var) {
        if (t0Var == null) {
            a(ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_128_CBC_SHA);
        }
        return c0(t0Var) && t0Var.U0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public e1 r(String str) {
        if (str == null) {
            a(47);
        }
        e1 e1VarT = q(str).t();
        if (e1VarT == null) {
            a(48);
        }
        return e1VarT;
    }

    public static boolean r0(t0 t0Var) {
        if (t0Var == null) {
            a(91);
        }
        vr.h hVarC = t0Var.T0().c();
        return (hVarC == null || Q(hVarC) == null) ? false : true;
    }

    public static boolean s0(vr.e eVar) {
        if (eVar == null) {
            a(96);
        }
        return T(eVar) != null;
    }

    public static boolean t0(t0 t0Var) {
        if (t0Var == null) {
            a(94);
        }
        return !t0Var.U0() && u0(t0Var);
    }

    public static boolean u0(t0 t0Var) {
        if (t0Var == null) {
            a(95);
        }
        vr.h hVarC = t0Var.T0().c();
        return (hVarC instanceof vr.e) && s0((vr.e) hVarC);
    }

    public static boolean v0(vr.e eVar) {
        if (eVar == null) {
            a(107);
        }
        return e(eVar, p.a.f183631b) || e(eVar, p.a.f183633c);
    }

    public static boolean w0(t0 t0Var) {
        return t0Var != null && n0(t0Var, p.a.f183643h);
    }

    public static boolean x0(x1 x1Var, zs.d dVar) {
        if (x1Var == null) {
            a(101);
        }
        if (dVar == null) {
            a(102);
        }
        vr.h hVarC = x1Var.c();
        return (hVarC instanceof vr.e) && e(hVarC, dVar);
    }

    public static boolean y0(t0 t0Var) {
        if (t0Var == null) {
            a(128);
        }
        return j0(t0Var, p.a.H0.i());
    }

    public static boolean z0(t0 t0Var) {
        if (t0Var == null) {
            a(130);
        }
        return j0(t0Var, p.a.J0.i());
    }

    public e1 A() {
        e1 e1VarS = S(m.DOUBLE);
        if (e1VarS == null) {
            a(62);
        }
        return e1VarS;
    }

    public e1 C() {
        e1 e1VarS = S(m.FLOAT);
        if (e1VarS == null) {
            a(61);
        }
        return e1VarS;
    }

    public vr.e D(int i15) {
        return q(p.b(i15));
    }

    public e1 E() {
        e1 e1VarS = S(m.INT);
        if (e1VarS == null) {
            a(59);
        }
        return e1VarS;
    }

    public vr.e F() {
        vr.e eVarP = p(p.a.f183652l0.m());
        if (eVarP == null) {
            a(21);
        }
        return eVarP;
    }

    public void F0(f0 f0Var) {
        if (f0Var == null) {
            a(1);
        }
        this.f183562f.e(new d(f0Var));
    }

    public e1 G() {
        e1 e1VarS = S(m.LONG);
        if (e1VarS == null) {
            a(60);
        }
        return e1VarS;
    }

    public vr.e H() {
        return q("Nothing");
    }

    public e1 I() {
        e1 e1VarT = H().t();
        if (e1VarT == null) {
            a(49);
        }
        return e1VarT;
    }

    public e1 J() {
        e1 e1VarA1 = i().X0(true);
        if (e1VarA1 == null) {
            a(52);
        }
        return e1VarA1;
    }

    public e1 K() {
        e1 e1VarA1 = I().X0(true);
        if (e1VarA1 == null) {
            a(50);
        }
        return e1VarA1;
    }

    public vr.e L() {
        return q("Number");
    }

    public e1 M() {
        e1 e1VarT = L().t();
        if (e1VarT == null) {
            a(56);
        }
        return e1VarT;
    }

    protected xr.c N() {
        xr.c.b bVar = xr.c.b.f220527a;
        if (bVar == null) {
            a(4);
        }
        return bVar;
    }

    public e1 P(m mVar) {
        if (mVar == null) {
            a(73);
        }
        e1 e1Var = this.f183559c.a().f183568a.get(mVar);
        if (e1Var == null) {
            a(74);
        }
        return e1Var;
    }

    public e1 S(m mVar) {
        if (mVar == null) {
            a(54);
        }
        e1 e1VarT = R(mVar).t();
        if (e1VarT == null) {
            a(55);
        }
        return e1VarT;
    }

    public e1 U() {
        e1 e1VarS = S(m.SHORT);
        if (e1VarS == null) {
            a(58);
        }
        return e1VarS;
    }

    protected rt.n V() {
        rt.n nVar = this.f183562f;
        if (nVar == null) {
            a(6);
        }
        return nVar;
    }

    public vr.e W() {
        return q("String");
    }

    public e1 X() {
        e1 e1VarT = W().t();
        if (e1VarT == null) {
            a(66);
        }
        return e1VarT;
    }

    public vr.e Y(int i15) {
        vr.e eVarP = p(p.f183621s.b(zs.f.l(p.d(i15))));
        if (eVarP == null) {
            a(18);
        }
        return eVarP;
    }

    public vr.e Z() {
        return q("Unit");
    }

    public e1 a0() {
        e1 e1VarT = Z().t();
        if (e1VarT == null) {
            a(65);
        }
        return e1VarT;
    }

    protected void f(boolean z15) {
        f0 f0Var = new f0(f183556g, this.f183562f, this, null);
        this.f183557a = f0Var;
        f0Var.U0(sr.b.f183548a.c().a(this.f183562f, this.f183557a, w(), N(), g(), z15));
        f0 f0Var2 = this.f183557a;
        f0Var2.c1(f0Var2);
    }

    protected xr.a g() {
        xr.a.C5895a c5895a = xr.a.C5895a.f220525a;
        if (c5895a == null) {
            a(3);
        }
        return c5895a;
    }

    public vr.e h() {
        return q("Any");
    }

    public e1 i() {
        e1 e1VarT = h().t();
        if (e1VarT == null) {
            a(51);
        }
        return e1VarT;
    }

    public vr.e j() {
        return q("Array");
    }

    public t0 k(t0 t0Var) {
        if (t0Var == null) {
            a(68);
        }
        t0 t0VarL = l(t0Var);
        if (t0VarL != null) {
            return t0VarL;
        }
        throw new IllegalStateException("not array: " + t0Var);
    }

    public t0 l(t0 t0Var) {
        t0 t0VarB;
        if (t0Var == null) {
            a(70);
        }
        if (d0(t0Var)) {
            if (t0Var.R0().size() != 1) {
                return null;
            }
            return t0Var.R0().get(0).getType();
        }
        t0 t0VarN = l2.n(t0Var);
        e1 e1Var = this.f183559c.a().f183570c.get(t0VarN);
        if (e1Var != null) {
            return e1Var;
        }
        i0 i0VarH = dt.i.h(t0VarN);
        if (i0VarH == null || (t0VarB = B(t0VarN, i0VarH)) == null) {
            return null;
        }
        return t0VarB;
    }

    public e1 m(p2 p2Var, t0 t0Var) {
        if (p2Var == null) {
            a(82);
        }
        if (t0Var == null) {
            a(83);
        }
        e1 e1VarN = n(p2Var, t0Var, wr.h.f214542p0.b());
        if (e1VarN == null) {
            a(84);
        }
        return e1VarN;
    }

    public e1 n(p2 p2Var, t0 t0Var, wr.h hVar) {
        if (p2Var == null) {
            a(78);
        }
        if (t0Var == null) {
            a(79);
        }
        if (hVar == null) {
            a(80);
        }
        e1 e1VarH = w0.h(u1.b(hVar), j(), Collections.singletonList(new f2(p2Var, t0Var)));
        if (e1VarH == null) {
            a(81);
        }
        return e1VarH;
    }

    public e1 o() {
        e1 e1VarS = S(m.BOOLEAN);
        if (e1VarS == null) {
            a(64);
        }
        return e1VarS;
    }

    public vr.e p(zs.c cVar) {
        if (cVar == null) {
            a(12);
        }
        vr.e eVarD = vr.s.d(s(), cVar, ds.d.FROM_BUILTINS);
        if (eVarD == null) {
            a(13);
        }
        return eVarD;
    }

    public f0 s() {
        if (this.f183557a == null) {
            this.f183557a = this.f183558b.a();
        }
        f0 f0Var = this.f183557a;
        if (f0Var == null) {
            a(7);
        }
        return f0Var;
    }

    public lt.k t() {
        lt.k kVarR = s().V(p.B).r();
        if (kVarR == null) {
            a(11);
        }
        return kVarR;
    }

    public e1 u() {
        e1 e1VarS = S(m.BYTE);
        if (e1VarS == null) {
            a(57);
        }
        return e1VarS;
    }

    public e1 v() {
        e1 e1VarS = S(m.CHAR);
        if (e1VarS == null) {
            a(63);
        }
        return e1VarS;
    }

    protected Iterable<xr.b> w() {
        List listSingletonList = Collections.singletonList(new tr.a(this.f183562f, s()));
        if (listSingletonList == null) {
            a(5);
        }
        return listSingletonList;
    }

    public vr.e x() {
        vr.e eVarP = p(p.a.X);
        if (eVarP == null) {
            a(35);
        }
        return eVarP;
    }

    public vr.e y() {
        return q("Comparable");
    }

    public e1 z() {
        e1 e1VarJ = J();
        if (e1VarJ == null) {
            a(53);
        }
        return e1VarJ;
    }
}
