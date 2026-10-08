package dt;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.EACTags;
import st.l2;
import st.t0;
import st.x0;
import st.x1;
import vr.b1;
import vr.c1;
import vr.f0;
import vr.i0;
import vr.i1;
import vr.o0;
import vr.u1;
import vr.v0;

/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zs.c f44480a = new zs.c("kotlin.jvm.JvmName");

    public static boolean A(vr.m mVar) {
        return D(mVar, vr.f.ENUM_CLASS);
    }

    public static boolean B(vr.m mVar) {
        if (mVar == null) {
            a(36);
        }
        return D(mVar, vr.f.ENUM_ENTRY);
    }

    public static boolean C(vr.m mVar) {
        return D(mVar, vr.f.INTERFACE);
    }

    private static boolean D(vr.m mVar, vr.f fVar) {
        if (fVar == null) {
            a(37);
        }
        return (mVar instanceof vr.e) && ((vr.e) mVar).k() == fVar;
    }

    public static boolean E(vr.m mVar) {
        if (mVar == null) {
            a(1);
        }
        while (mVar != null) {
            if (u(mVar) || y(mVar)) {
                return true;
            }
            mVar = mVar.b();
        }
        return false;
    }

    private static boolean F(t0 t0Var, vr.m mVar) {
        if (t0Var == null) {
            a(30);
        }
        if (mVar == null) {
            a(31);
        }
        vr.h hVarC = t0Var.T0().c();
        if (hVarC == null) {
            return false;
        }
        vr.m mVarA = hVarC.Q0();
        return (mVarA instanceof vr.h) && (mVar instanceof vr.h) && ((vr.h) mVar).o().equals(((vr.h) mVarA).o());
    }

    public static boolean G(vr.m mVar) {
        return (D(mVar, vr.f.CLASS) || D(mVar, vr.f.INTERFACE)) && ((vr.e) mVar).w() == f0.SEALED;
    }

    public static boolean H(vr.e eVar, vr.e eVar2) {
        if (eVar == null) {
            a(28);
        }
        if (eVar2 == null) {
            a(29);
        }
        return I(eVar.t(), eVar2.Q0());
    }

    public static boolean I(t0 t0Var, vr.m mVar) {
        if (t0Var == null) {
            a(32);
        }
        if (mVar == null) {
            a(33);
        }
        if (F(t0Var, mVar)) {
            return true;
        }
        Iterator<t0> it = t0Var.T0().q().iterator();
        while (it.hasNext()) {
            if (I(it.next(), mVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(vr.m mVar) {
        return mVar != null && (mVar.b() instanceof o0);
    }

    public static boolean K(u1 u1Var, t0 t0Var) {
        if (u1Var == null) {
            a(65);
        }
        if (t0Var == null) {
            a(66);
        }
        if (u1Var.Q() || x0.a(t0Var)) {
            return false;
        }
        if (l2.b(t0Var)) {
            return true;
        }
        sr.j jVarM = ht.e.m(u1Var);
        if (!sr.j.t0(t0Var)) {
            tt.e eVar = tt.e.f192117a;
            if (!eVar.c(jVarM.X(), t0Var) && !eVar.c(jVarM.L().t(), t0Var) && !eVar.c(jVarM.i(), t0Var) && !sr.t.d(t0Var)) {
                return false;
            }
        }
        return true;
    }

    public static <D extends vr.b> D L(D d15) {
        if (d15 == null) {
            a(58);
        }
        while (d15.k() == vr.b.a.FAKE_OVERRIDE) {
            Collection<? extends vr.b> collectionE = d15.e();
            if (collectionE.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d15);
            }
            d15 = (D) collectionE.iterator().next();
        }
        return d15;
    }

    public static <D extends vr.q> D M(D d15) {
        if (d15 == null) {
            a(63);
        }
        if (d15 instanceof vr.b) {
            return L((vr.b) d15);
        }
        if (d15 == null) {
            a(64);
        }
        return d15;
    }

    private static /* synthetic */ void a(int i15) {
        String str;
        int i16;
        switch (i15) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case EACTags.CURRENCY_CODE /* 42 */:
            case EACTags.DATE_OF_BIRTH /* 43 */:
            case 47:
            case 49:
            case 50:
            case EACTags.TRANSACTION_DATE /* 51 */:
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
            case 53:
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
            case 61:
            case 62:
            case 64:
            case EACTags.MESSAGE_REFERENCE /* 71 */:
            case EACTags.DEPRECATED /* 75 */:
            case EACTags.HISTORICAL_BYTES /* 82 */:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i15) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case EACTags.CURRENCY_CODE /* 42 */:
            case EACTags.DATE_OF_BIRTH /* 43 */:
            case 47:
            case 49:
            case 50:
            case EACTags.TRANSACTION_DATE /* 51 */:
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
            case 53:
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
            case 61:
            case 62:
            case 64:
            case EACTags.MESSAGE_REFERENCE /* 71 */:
            case EACTags.DEPRECATED /* 75 */:
            case EACTags.HISTORICAL_BYTES /* 82 */:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                i16 = 2;
                break;
            default:
                i16 = 3;
                break;
        }
        Object[] objArr = new Object[i16];
        switch (i15) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
            case 60:
            case 63:
            case EACTags.ANSWER_TO_RESET /* 81 */:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case EACTags.CURRENCY_CODE /* 42 */:
            case EACTags.DATE_OF_BIRTH /* 43 */:
            case 47:
            case 49:
            case 50:
            case EACTags.TRANSACTION_DATE /* 51 */:
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
            case 53:
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
            case 61:
            case 62:
            case 64:
            case EACTags.MESSAGE_REFERENCE /* 71 */:
            case EACTags.DEPRECATED /* 75 */:
            case EACTags.HISTORICAL_BYTES /* 82 */:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
            case 66:
                objArr[0] = "type";
                break;
            case BERTags.DATE /* 31 */:
                objArr[0] = "other";
                break;
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                objArr[0] = "classKind";
                break;
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
            case 48:
            case EACTags.CURRENCY_EXPONENT /* 54 */:
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
            case EACTags.APPLICATION_IMAGE /* 68 */:
            case EACTags.DISPLAY_IMAGE /* 69 */:
            case 76:
            case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 65:
                objArr[0] = "variable";
                break;
            case 70:
                objArr[0] = "f";
                break;
            case 72:
                objArr[0] = "current";
                break;
            case 73:
                objArr[0] = "result";
                break;
            case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
                objArr[0] = "memberDescriptor";
                break;
            case 78:
            case 79:
            case EACTags.UNIFORM_RESOURCE_LOCATOR /* 80 */:
                objArr[0] = "annotated";
                break;
            case 84:
            case 86:
            case 89:
            case 91:
                objArr[0] = "scope";
                break;
            case 87:
            case 90:
            case 92:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i15) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case EACTags.CURRENCY_CODE /* 42 */:
            case EACTags.DATE_OF_BIRTH /* 43 */:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case EACTags.TRANSACTION_DATE /* 51 */:
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 61:
            case 62:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case EACTags.MESSAGE_REFERENCE /* 71 */:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case EACTags.DEPRECATED /* 75 */:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case EACTags.HISTORICAL_BYTES /* 82 */:
            case 83:
                objArr[1] = "getContainingSourceFile";
                break;
            case 85:
                objArr[1] = "getAllDescriptors";
                break;
            case 88:
                objArr[1] = "getFunctionByName";
                break;
            case 93:
                objArr[1] = "getPropertyByName";
                break;
            case 95:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i15) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case EACTags.CURRENCY_CODE /* 42 */:
            case EACTags.DATE_OF_BIRTH /* 43 */:
            case 47:
            case 49:
            case 50:
            case EACTags.TRANSACTION_DATE /* 51 */:
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
            case 53:
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
            case 61:
            case 62:
            case 64:
            case EACTags.MESSAGE_REFERENCE /* 71 */:
            case EACTags.DEPRECATED /* 75 */:
            case EACTags.HISTORICAL_BYTES /* 82 */:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case BERTags.DATE /* 31 */:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                objArr[2] = "isKindOf";
                break;
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                objArr[2] = "hasAbstractMembers";
                break;
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
                objArr[2] = "getSuperClassType";
                break;
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case EACTags.CURRENCY_EXPONENT /* 54 */:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 60:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 63:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 65:
            case 66:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case EACTags.DISPLAY_IMAGE /* 69 */:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 70:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 72:
            case 73:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 76:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 78:
                objArr[2] = "getJvmName";
                break;
            case 79:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case EACTags.UNIFORM_RESOURCE_LOCATOR /* 80 */:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case EACTags.ANSWER_TO_RESET /* 81 */:
                objArr[2] = "getContainingSourceFile";
                break;
            case 84:
                objArr[2] = "getAllDescriptors";
                break;
            case 86:
            case 87:
                objArr[2] = "getFunctionByName";
                break;
            case 89:
            case 90:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 91:
            case 92:
                objArr[2] = "getPropertyByName";
                break;
            case 94:
                objArr[2] = "getDirectMember";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i15) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case EACTags.CURRENCY_CODE /* 42 */:
            case EACTags.DATE_OF_BIRTH /* 43 */:
            case 47:
            case 49:
            case 50:
            case EACTags.TRANSACTION_DATE /* 51 */:
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
            case 53:
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
            case 61:
            case 62:
            case 64:
            case EACTags.MESSAGE_REFERENCE /* 71 */:
            case EACTags.DEPRECATED /* 75 */:
            case EACTags.HISTORICAL_BYTES /* 82 */:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static boolean b(vr.m mVar, vr.m mVar2) {
        if (mVar == null) {
            a(16);
        }
        if (mVar2 == null) {
            a(17);
        }
        return g(mVar).equals(g(mVar2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <D extends vr.a> void c(D d15, Set<D> set) {
        if (d15 == null) {
            a(72);
        }
        if (set == 0) {
            a(73);
        }
        if (set.contains(d15)) {
            return;
        }
        Iterator<? extends vr.a> it = d15.Q0().e().iterator();
        while (it.hasNext()) {
            vr.a aVarA = it.next().Q0();
            c(aVarA, set);
            set.add(aVarA);
        }
    }

    public static <D extends vr.a> Set<D> d(D d15) {
        if (d15 == null) {
            a(70);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c(d15.Q0(), linkedHashSet);
        return linkedHashSet;
    }

    public static vr.e e(t0 t0Var) {
        if (t0Var == null) {
            a(45);
        }
        return f(t0Var.T0());
    }

    public static vr.e f(x1 x1Var) {
        if (x1Var == null) {
            a(46);
        }
        vr.e eVar = (vr.e) x1Var.c();
        if (eVar == null) {
            a(47);
        }
        return eVar;
    }

    public static i0 g(vr.m mVar) {
        if (mVar == null) {
            a(21);
        }
        i0 i0VarI = i(mVar);
        if (i0VarI == null) {
            a(22);
        }
        return i0VarI;
    }

    public static i0 h(t0 t0Var) {
        if (t0Var == null) {
            a(20);
        }
        vr.h hVarC = t0Var.T0().c();
        if (hVarC == null) {
            return null;
        }
        return i(hVarC);
    }

    public static i0 i(vr.m mVar) {
        if (mVar == null) {
            a(23);
        }
        while (mVar != null) {
            if (mVar instanceof i0) {
                return (i0) mVar;
            }
            if (mVar instanceof v0) {
                return ((v0) mVar).F0();
            }
            mVar = mVar.b();
        }
        return null;
    }

    public static i1 j(vr.m mVar) {
        if (mVar == null) {
            a(81);
        }
        if (mVar instanceof b1) {
            mVar = ((b1) mVar).Z();
        }
        if (mVar instanceof vr.p) {
            i1 i1VarB = ((vr.p) mVar).m().b();
            if (i1VarB == null) {
                a(82);
            }
            return i1VarB;
        }
        i1 i1Var = i1.f208053a;
        if (i1Var == null) {
            a(83);
        }
        return i1Var;
    }

    public static vr.u k(vr.e eVar, boolean z15) {
        if (eVar == null) {
            a(48);
        }
        vr.f fVarK = eVar.k();
        if (fVarK == vr.f.ENUM_CLASS || fVarK.e()) {
            vr.u uVar = vr.t.f208076a;
            if (uVar == null) {
                a(49);
            }
            return uVar;
        }
        if (G(eVar)) {
            if (z15) {
                vr.u uVar2 = vr.t.f208078c;
                if (uVar2 == null) {
                    a(50);
                }
                return uVar2;
            }
            vr.u uVar3 = vr.t.f208076a;
            if (uVar3 == null) {
                a(51);
            }
            return uVar3;
        }
        if (u(eVar)) {
            vr.u uVar4 = vr.t.f208087l;
            if (uVar4 == null) {
                a(52);
            }
            return uVar4;
        }
        vr.u uVar5 = vr.t.f208080e;
        if (uVar5 == null) {
            a(53);
        }
        return uVar5;
    }

    public static c1 l(vr.m mVar) {
        if (mVar == null) {
            a(0);
        }
        if (mVar instanceof vr.e) {
            return ((vr.e) mVar).P0();
        }
        return null;
    }

    public static zs.d m(vr.m mVar) {
        if (mVar == null) {
            a(2);
        }
        zs.c cVarO = o(mVar);
        return cVarO != null ? cVarO.i() : p(mVar);
    }

    public static zs.c n(vr.m mVar) {
        if (mVar == null) {
            a(3);
        }
        zs.c cVarO = o(mVar);
        if (cVarO == null) {
            cVarO = p(mVar).m();
        }
        if (cVarO == null) {
            a(4);
        }
        return cVarO;
    }

    private static zs.c o(vr.m mVar) {
        if (mVar == null) {
            a(5);
        }
        if ((mVar instanceof i0) || ut.l.m(mVar)) {
            return zs.c.f236639d;
        }
        if (mVar instanceof v0) {
            return ((v0) mVar).g();
        }
        if (mVar instanceof o0) {
            return ((o0) mVar).g();
        }
        return null;
    }

    private static zs.d p(vr.m mVar) {
        if (mVar == null) {
            a(6);
        }
        zs.d dVarB = m(mVar.b()).b(mVar.getName());
        if (dVarB == null) {
            a(7);
        }
        return dVarB;
    }

    public static <D extends vr.m> D q(vr.m mVar, Class<D> cls) {
        if (cls == null) {
            a(18);
        }
        return (D) r(mVar, cls, true);
    }

    public static <D extends vr.m> D r(vr.m mVar, Class<D> cls, boolean z15) {
        if (cls == null) {
            a(19);
        }
        if (mVar == null) {
            return null;
        }
        if (z15) {
            mVar = (D) mVar.b();
        }
        while (mVar != null) {
            if (cls.isInstance(mVar)) {
                return (D) mVar;
            }
            mVar = (D) mVar.b();
        }
        return null;
    }

    public static vr.e s(vr.e eVar) {
        if (eVar == null) {
            a(44);
        }
        Iterator<t0> it = eVar.o().q().iterator();
        while (it.hasNext()) {
            vr.e eVarE = e(it.next());
            if (eVarE.k() != vr.f.INTERFACE) {
                return eVarE;
            }
        }
        return null;
    }

    public static boolean t(vr.m mVar) {
        return D(mVar, vr.f.ANNOTATION_CLASS);
    }

    public static boolean u(vr.m mVar) {
        if (mVar == null) {
            a(34);
        }
        return v(mVar) && mVar.getName().equals(zs.h.f236656b);
    }

    public static boolean v(vr.m mVar) {
        return D(mVar, vr.f.CLASS);
    }

    public static boolean w(vr.m mVar) {
        return v(mVar) || A(mVar);
    }

    public static boolean x(vr.m mVar) {
        return D(mVar, vr.f.OBJECT) && ((vr.e) mVar).e0();
    }

    public static boolean y(vr.m mVar) {
        return (mVar instanceof vr.q) && ((vr.q) mVar).h() == vr.t.f208081f;
    }

    public static boolean z(vr.e eVar, vr.e eVar2) {
        if (eVar == null) {
            a(26);
        }
        if (eVar2 == null) {
            a(27);
        }
        Iterator<t0> it = eVar.o().q().iterator();
        while (it.hasNext()) {
            if (F(it.next(), eVar2.Q0())) {
                return true;
            }
        }
        return false;
    }
}
