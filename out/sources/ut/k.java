package ut;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'r' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class k {
    public static final k A;
    public static final k F0;
    public static final k I;
    public static final k N0;
    public static final k V0;
    public static final k Y;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final k f201293d1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private static final /* synthetic */ k[] f201302h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private static final /* synthetic */ wq.a f201303i1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final k f201312r;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final k f201320v0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f201329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f201330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f201290c = new k("UNRESOLVED_TYPE", 0, "Unresolved type for %s", true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f201292d = new k("UNRESOLVED_TYPE_PARAMETER_TYPE", 1, "Unresolved type parameter type", true);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f201294e = new k("UNRESOLVED_CLASS_TYPE", 2, "Unresolved class %s", true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k f201296f = new k("UNRESOLVED_JAVA_CLASS", 3, "Unresolved java class %s", true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k f201298g = new k("UNRESOLVED_DECLARATION", 4, "Unresolved declaration %s", true);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k f201300h = new k("UNRESOLVED_KCLASS_CONSTANT_VALUE", 5, "Unresolved type for %s (arrayDimensions=%s)", true);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final k f201304j = new k("UNRESOLVED_TYPE_ALIAS", 6, "Unresolved type alias %s", false, 2, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final k f201305k = new k("RETURN_TYPE", 7, "Return type for %s cannot be resolved", false, 2, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final k f201306l = new k("RETURN_TYPE_FOR_FUNCTION", 8, "Return type for function cannot be resolved", false, 2, null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final k f201307m = new k("RETURN_TYPE_FOR_PROPERTY", 9, "Return type for property %s cannot be resolved", false, 2, null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final k f201308n = new k("RETURN_TYPE_FOR_CONSTRUCTOR", 10, "Return type for constructor %s cannot be resolved", false, 2, null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final k f201309p = new k("IMPLICIT_RETURN_TYPE_FOR_FUNCTION", 11, "Implicit return type for function %s cannot be resolved", false, 2, null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final k f201310q = new k("IMPLICIT_RETURN_TYPE_FOR_PROPERTY", 12, "Implicit return type for property %s cannot be resolved", false, 2, null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final k f201314s = new k("ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT", 14, "%s() return type", false, 2, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final k f201316t = new k("RECURSIVE_TYPE", 15, "Recursive type", false, 2, null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final k f201319v = new k("RECURSIVE_TYPE_ALIAS", 16, "Recursive type alias %s", false, 2, null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final k f201321w = new k("RECURSIVE_ANNOTATION_TYPE", 17, "Recursive annotation's type", false, 2, null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final k f201323x = new k("CYCLIC_UPPER_BOUNDS", 18, "Cyclic upper bounds", false, 2, null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final k f201325y = new k("CYCLIC_SUPERTYPES", 19, "Cyclic supertypes", false, 2, null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final k f201327z = new k("UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE", 20, "Cannot infer a lambda context receiver type", false, 2, null);
    public static final k B = new k("UNINFERRED_TYPE_VARIABLE", 22, "Cannot infer a type variable %s", false, 2, null);
    public static final k C = new k("RESOLUTION_ERROR_TYPE", 23, "Resolution error type (%s)", false, 2, null);
    public static final k D = new k("ERROR_EXPECTED_TYPE", 24, "Error expected type", false, 2, null);
    public static final k E = new k("ERROR_DATA_FLOW_TYPE", 25, "Error type for data flow", false, 2, null);
    public static final k F = new k("ERROR_WHILE_RECONSTRUCTING_BARE_TYPE", 26, "Failed to reconstruct type %s", false, 2, null);
    public static final k G = new k("UNABLE_TO_SUBSTITUTE_TYPE", 27, "Unable to substitute type (%s)", false, 2, null);
    public static final k H = new k("DONT_CARE", 28, "Special DONT_CARE type", false, 2, null);
    public static final k K = new k("FUNCTION_PLACEHOLDER_TYPE", 30, "Function placeholder type (arguments: %s)", false, 2, null);
    public static final k L = new k("TYPE_FOR_COMPILER_EXCEPTION", 31, "Error type for a compiler exception while analyzing %s", false, 2, null);
    public static final k O = new k("ERROR_FLEXIBLE_TYPE", 32, "Error java flexible type with id %s. (%s..%s)", false, 2, null);
    public static final k P = new k("ERROR_RAW_TYPE", 33, "Error raw type %s", false, 2, null);
    public static final k R = new k("TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS", 34, "Inconsistent type %s (parameters.size = %s, arguments.size = %s)", false, 2, null);
    public static final k T = new k("ILLEGAL_TYPE_RANGE_FOR_DYNAMIC", 35, "Illegal type range for dynamic type %s..%s", false, 2, null);
    public static final k X = new k("CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER", 36, "Unknown type parameter %s. Please try recompiling module containing \"%s\"", false, 2, null);
    public static final k Z = new k("INCONSISTENT_SUSPEND_FUNCTION", 38, "Inconsistent suspend function type in metadata with constructor %s", false, 2, null);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final k f201301h0 = new k("UNEXPECTED_FLEXIBLE_TYPE_ID", 39, "Unexpected id of a flexible type %s. (%s..%s)", false, 2, null);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final k f201311q0 = new k("UNKNOWN_TYPE", 40, "Unknown type", false, 2, null);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final k f201313r0 = new k("NO_TYPE_SPECIFIED", 41, "No type specified for %s", false, 2, null);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final k f201315s0 = new k("NO_TYPE_FOR_LOOP_RANGE", 42, "Loop range has no type", false, 2, null);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final k f201317t0 = new k("NO_TYPE_FOR_LOOP_PARAMETER", 43, "Loop parameter has no type", false, 2, null);

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final k f201318u0 = new k("MISSED_TYPE_FOR_PARAMETER", 44, "Missed a type for a value parameter %s", false, 2, null);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final k f201322w0 = new k("PARSE_ERROR_ARGUMENT", 46, "Error type for parse error argument %s", false, 2, null);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final k f201324x0 = new k("STAR_PROJECTION_IN_CALL", 47, "Error type for star projection directly passing as a call type argument", false, 2, null);

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final k f201326y0 = new k("PROHIBITED_DYNAMIC_TYPE", 48, "Dynamic type in a not allowed context", false, 2, null);

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final k f201328z0 = new k("NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT", 49, "Not an annotation type %s in the annotation context", false, 2, null);
    public static final k A0 = new k("UNIT_RETURN_TYPE_FOR_INC_DEC", 50, "Unit type returned by inc or dec", false, 2, null);
    public static final k B0 = new k("RETURN_NOT_ALLOWED", 51, "Return not allowed", false, 2, null);
    public static final k C0 = new k("UNRESOLVED_PARCEL_TYPE", 52, "Unresolved 'Parcel' type", true);
    public static final k D0 = new k("KAPT_ERROR_TYPE", 53, "Kapt error type", false, 2, null);
    public static final k E0 = new k("SYNTHETIC_ELEMENT_ERROR_TYPE", 54, "Error type for synthetic element", false, 2, null);
    public static final k G0 = new k("ERROR_EXPRESSION_TYPE", 56, "Error expression type", false, 2, null);
    public static final k H0 = new k("ERROR_RECEIVER_TYPE", 57, "Error receiver type for %s", false, 2, null);
    public static final k I0 = new k("ERROR_CONSTANT_VALUE", 58, "Error constant value %s", false, 2, null);
    public static final k J0 = new k("EMPTY_CALLABLE_REFERENCE", 59, "Empty callable reference", false, 2, null);
    public static final k K0 = new k("UNSUPPORTED_CALLABLE_REFERENCE_TYPE", 60, "Unsupported callable reference type %s", false, 2, null);
    public static final k L0 = new k("TYPE_FOR_DELEGATION", 61, "Error delegation type for %s", false, 2, null);
    public static final k M0 = new k("UNAVAILABLE_TYPE_FOR_DECLARATION", 62, "Type is unavailable for declaration %s", false, 2, null);
    public static final k O0 = new k("ERROR_TYPE_PROJECTION", 64, "Error type projection", false, 2, null);
    public static final k P0 = new k("ERROR_SUPER_TYPE", 65, "Error super type", false, 2, null);
    public static final k Q0 = new k("SUPER_TYPE_FOR_ERROR_TYPE", 66, "Supertype of error type %s", false, 2, null);
    public static final k R0 = new k("ERROR_PROPERTY_TYPE", 67, "Error property type", false, 2, null);
    public static final k S0 = new k("ERROR_CLASS", 68, "Error class", false, 2, null);
    public static final k T0 = new k("TYPE_FOR_ERROR_TYPE_CONSTRUCTOR", 69, "Type for error type constructor (%s)", false, 2, null);
    public static final k U0 = new k("INTERSECTION_OF_ERROR_TYPES", 70, "Intersection of error types %s", false, 2, null);
    public static final k W0 = new k("NOT_FOUND_UNSIGNED_TYPE", 72, "Unsigned type %s not found", false, 2, null);
    public static final k X0 = new k("ERROR_ENUM_TYPE", 73, "Not found the corresponding enum class for given enum entry %s.%s", false, 2, null);
    public static final k Y0 = new k("NO_RECORDED_TYPE", 74, "Not found recorded type for %s", false, 2, null);
    public static final k Z0 = new k("NOT_FOUND_DESCRIPTOR_FOR_FUNCTION", 75, "Descriptor not found for function %s", false, 2, null);

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final k f201288a1 = new k("NOT_FOUND_DESCRIPTOR_FOR_CLASS", 76, "Cannot build class type, descriptor not found for builder %s", false, 2, null);

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final k f201289b1 = new k("NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER", 77, "Cannot build type parameter type, descriptor not found for builder %s", false, 2, null);

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final k f201291c1 = new k("UNMAPPED_ANNOTATION_TARGET_TYPE", 78, "Type for unmapped Java annotation target to Kotlin one", false, 2, null);

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final k f201295e1 = new k("NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION", 80, "No fqName for annotation %s", false, 2, null);

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final k f201297f1 = new k("NOT_FOUND_FQNAME", 81, "No fqName for %s", false, 2, null);

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final k f201299g1 = new k("TYPE_FOR_GENERATED_ERROR_EXPRESSION", 82, "Type for generated error expression", false, 2, null);

    static {
        fr.k kVar = null;
        f201312r = new k("IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR", 13, "Implicit return type for property accessor %s cannot be resolved", false, 2, kVar);
        A = new k("UNINFERRED_LAMBDA_PARAMETER_TYPE", 21, "Cannot infer a lambda parameter type", false, 2, kVar);
        I = new k("STUB_TYPE", 29, "Stub type %s", false, 2, kVar);
        Y = new k("CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME", 37, "Couldn't deserialize type parameter %s in %s", false, 2, kVar);
        f201320v0 = new k("MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER", 45, "Missed a type argument for a type parameter %s", false, 2, kVar);
        fr.k kVar2 = null;
        F0 = new k("AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE", 55, "Error type in ad hoc resolve for lighter classes", false, 2, kVar2);
        N0 = new k("ERROR_TYPE_PARAMETER", 63, "Error type parameter", false, 2, kVar2);
        V0 = new k("CANNOT_COMPUTE_ERASED_BOUND", 71, "Cannot compute erased upper bound of a type parameter %s", false, 2, kVar2);
        f201293d1 = new k("UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT", 79, "Unknown type for an array element of a java annotation argument", false, 2, kVar2);
        k[] kVarArrB = b();
        f201302h1 = kVarArrB;
        f201303i1 = wq.b.a(kVarArrB);
    }

    private k(String str, int i15, String str2, boolean z15) {
        super(str, i15);
        this.f201329a = str2;
        this.f201330b = z15;
    }

    private static final /* synthetic */ k[] b() {
        return new k[]{f201290c, f201292d, f201294e, f201296f, f201298g, f201300h, f201304j, f201305k, f201306l, f201307m, f201308n, f201309p, f201310q, f201312r, f201314s, f201316t, f201319v, f201321w, f201323x, f201325y, f201327z, A, B, C, D, E, F, G, H, I, K, L, O, P, R, T, X, Y, Z, f201301h0, f201311q0, f201313r0, f201315s0, f201317t0, f201318u0, f201320v0, f201322w0, f201324x0, f201326y0, f201328z0, A0, B0, C0, D0, E0, F0, G0, H0, I0, J0, K0, L0, M0, N0, O0, P0, Q0, R0, S0, T0, U0, V0, W0, X0, Y0, Z0, f201288a1, f201289b1, f201291c1, f201293d1, f201295e1, f201297f1, f201299g1};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f201302h1.clone();
    }

    public final String e() {
        return this.f201329a;
    }

    public final boolean g() {
        return this.f201330b;
    }

    /* synthetic */ k(String str, int i15, String str2, boolean z15, int i16, fr.k kVar) {
        this(str, i15, str2, (i16 & 2) != 0 ? false : z15);
    }
}
