"""Simple PYTest program"""

import pytest
import math
@pytest.mark.great
def test_sqrt():
    num=25
    assert math.sqrt(num)==5
@pytest.mark.great
def test_sqr():
    num=7
    assert num*num==40

@pytest.mark.other
def test_sum():
    num=5
    assert num+num==11
