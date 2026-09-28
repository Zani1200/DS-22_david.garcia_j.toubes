package org.example.e3;

import java.util.Objects;

public record Triangle(int angle0, int angle1, int angle2) {
    public Triangle {
        if(angle0+angle1+angle2 != 180){
            throw new IllegalArgumentException("La suma de los angulos tiene que ser 180");
        }
    }

    public Triangle(Triangle t){
        this(t.angle0(),t.angle1(),t.angle2());
    }

    public boolean isRight () {
        if(angle0 == 90 || angle1 == 90 || angle2 == 90){
            return true;
        }
        return false;
    }
    public boolean isAcute () { return false;/* ... */ }
    /**
     * Tests if a triangle is obtuse .
     * A triangle is obtuse if it has one angle measuring more than 90 degrees .
     * @return True if it is obtuse , false otherwise
     */
    public boolean isObtuse () { return false;/* ... */ }
    /**
     * Tests if a triangle is equilateral .
     * A triangle is equilateral if all the angles are the same .
     * @return True if it is equilateral , false otherwise
     */
    public boolean isEquilateral () { return false;/* ... */ }
    /**
     * Tests if a triangle is isosceles .
     * A triangle is isosceles if it has two angles of the same measure .
     * @return True if it is isosceles , false otherwise
     */
    public boolean isIsosceles () { return false;/* ... */ }
    /**
     * Tests if a triangle is scalene .
     * A triangle is scalene if it has all angles of different measure .
     * @return True if it is scalene , false otherwise
     */
    public boolean isScalene () {
        return false;
    }
/**
 * Tests if two triangles are equal .
 * Two triangles are equal if their angles are the same ,
 * regardless of the order .
 * @param o The reference object with which to compare .
 * @return True if they are equal , false otherwise .
 */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle triangle)) return false;
        return angle0 == triangle.angle0 && angle1 == triangle.angle1 && angle2 == triangle.angle2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(angle0, angle1, angle2);
    }
}
